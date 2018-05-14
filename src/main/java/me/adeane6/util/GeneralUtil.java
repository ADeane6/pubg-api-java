package me.adeane6.util;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import me.adeane6.model.Endpoints;
import me.adeane6.model.Entity;
import me.adeane6.model.Telemetry.Event.EventBase;
import me.adeane6.model.asset.Asset;
import me.adeane6.model.match.MatchData;
import me.adeane6.model.participant.Participant;
import me.adeane6.model.player.Player;
import me.adeane6.model.roster.Roster;
import me.adeane6.model.status.Status;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class GeneralUtil {
    private static Gson gsonBuilder() {
        return new GsonBuilder()
                .registerTypeAdapter(OffsetDateTime.class, new TypeAdapter<OffsetDateTime>() {
                    @Override
                    public void write(JsonWriter out, OffsetDateTime value) throws IOException {
                        out.value(value.toString());
                    }

                    @Override
                    public OffsetDateTime read(JsonReader in) throws IOException {
                        return OffsetDateTime.parse(in.nextString());
                    }
                })
                .registerTypeAdapter(Instant.class, (JsonSerializer<Instant>) (src, typeOfSrc, context) ->
                        new JsonPrimitive(DateTimeFormatter.ISO_INSTANT.format(src)))
                .registerTypeAdapter(Entity.class, (JsonDeserializer<Entity>) (json, typeOfT, context) -> {
                    JsonObject jsonObject = json.getAsJsonObject();

                    JsonElement jsonType = jsonObject.get("type");
                    String type = jsonType.getAsString();

                    switch (type) {
                        case "player":
                            return context.deserialize(json, Player.class);
                        case "match":
                            return context.deserialize(json, MatchData.class);
                        case "status":
                            return context.deserialize(json, Status.class);
                        case "roster":
                            return context.deserialize(json, Roster.class);
                        case "participant":
                            return context.deserialize(json, Participant.class);
                        case "asset":
                            return context.deserialize(json, Asset.class);
                        default:
                            return null;
                    }
                })
                .registerTypeAdapter(EventBase.class, (JsonDeserializer<EventBase>) (json, typeOfT, context) -> {
                    JsonObject jsonObject = json.getAsJsonObject();
                    JsonElement jsonType = jsonObject.get("_T");
                    String type = jsonType.getAsString();
                    try {
                        Class c = Class.forName("me.adeane6.model.Telemetry." + type);
                        return context.deserialize(json, c);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return null;
                })
                .create();
    }

    public static Retrofit retrofitBuilder(String apiKey) {
        return new Retrofit.Builder()
                .baseUrl(Endpoints.BASE)
                .addConverterFactory(GsonConverterFactory.create(gsonBuilder()))
                .client(okHttpClientBuilder(apiKey))
                .build();
    }

    private static OkHttpClient okHttpClientBuilder(String apiKey) {
        return new OkHttpClient.Builder().addInterceptor(chain -> {
            Request original = chain.request();

            // Request customization: add request headers
            Request request = original.newBuilder()
                    .addHeader("Authorization", "Bearer " + apiKey)
                    .addHeader("Accept", "application/vnd.api+json").build();

            return chain.proceed(request);
        }).build();
    }

    public static <T> T getResponse(Call<T> call) {
        try {
            Response<T> response = call.execute();
            return getBody(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static <T> T getBody(Response<T> response) {

        return response.body();
    }
}
