package me.adeane6;

import me.adeane6.model.ApiStatus;
import me.adeane6.model.Region;
import me.adeane6.model.Endpoints;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by ashley on 05/04/2018.
 */
public class PUBGApi {

    private final String API_KEY;

    private Region region;

    private OkHttpClient client;

    private Request.Builder requestBuilder;

    public PUBGApi(String API_KEY, Region region) {
        this.API_KEY = API_KEY;
        this.region = region;
        this.client = new OkHttpClient();
        buildHeaders();
    }

    private void buildHeaders() {
        requestBuilder = new Request.Builder()
                .addHeader("Authorization", API_KEY)
                .addHeader("Accept","application/vnd.api+json");
    }

    public PUBGApi(String API_KEY) {
        this.API_KEY = API_KEY;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
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
