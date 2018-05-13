package me.adeane6;

import me.adeane6.model.ApiStatus;
import me.adeane6.model.Endpoints;
import me.adeane6.model.status.Status;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by ashley on 05/04/2018.
 */
public class PUBGApi {

    private final String API_KEY;

    private OkHttpClient client;

    private Request.Builder requestBuilder;

    public PUBGApi(String API_KEY) {
        this.API_KEY = API_KEY;
        this.client = new OkHttpClient();
        buildHeaders();
    }

    private void buildHeaders() {
        requestBuilder = new Request.Builder()
                .addHeader("Authorization", API_KEY)
                .addHeader("Accept","application/vnd.api+json");
    }

    public ApiStatus status() {
        Request request = requestBuilder.url(Endpoints.STATUS_PATH).build();
        Response response = call(request);
        if(response.isSuccessful()) {
            return ApiStatus.ONLINE;
        }
        return ApiStatus.ERROR;
    }

    private Response call(Request request) {
        try {
            return client.newCall(request).execute();
        } catch (IOException ex) {
            System.out.print(ex);
            return null;
        }
    }
}
