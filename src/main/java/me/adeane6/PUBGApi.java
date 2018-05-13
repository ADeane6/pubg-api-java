package me.adeane6;

import me.adeane6.model.ApiStatus;
import me.adeane6.model.Endpoints;
import me.adeane6.model.Shard;
import me.adeane6.model.match.MatchWrapper;
import me.adeane6.model.player.Player;
import me.adeane6.model.status.Status;
import me.adeane6.model.wrapper.Data;
import me.adeane6.model.wrapper.ResponseData;
import me.adeane6.model.wrapper.ResponseDataList;
import me.adeane6.util.GeneralUtil;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by ashley on 05/04/2018.
 */
public class PUBGApi {

    private final String API_KEY;

    protected PUBGInterface pubgInterface;

    public PUBGApi(String API_KEY) {
        this.API_KEY = API_KEY;
        pubgInterface = GeneralUtil.retrofitBuilder(API_KEY).create(PUBGInterface.class);
    }

    public ApiStatus status() {
        Data<Status> statusResponseData = GeneralUtil.getResponse(pubgInterface.getStatus());
        if(statusResponseData != null) {
            return ApiStatus.ONLINE;
        }
        return ApiStatus.ERROR;
    }

    public ResponseDataList<Player> getPlayersByNames(Shard shard, String... playersNames) {

        String players = Arrays.stream(playersNames).collect(Collectors.joining(","));

        return GeneralUtil.getResponse(pubgInterface.getPlayersByNames(shard.toString(), players));
    }

    public ResponseDataList<Player> getPlayersByIds(Shard shard, String... playerIds) {
        String players = Arrays.stream(playerIds).collect(Collectors.joining(","));

        return GeneralUtil.getResponse(pubgInterface.getPlayersByIds(shard.toString(), players));
    }

    public MatchWrapper getMatch(Shard shard, String id) {
        return GeneralUtil.getResponse(pubgInterface.getMatch(shard.toString(), id));
    }

}
