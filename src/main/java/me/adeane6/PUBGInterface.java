package me.adeane6;

import me.adeane6.model.Endpoints;
import me.adeane6.model.Telemetry.Event.EventBase;
import me.adeane6.model.match.MatchWrapper;
import me.adeane6.model.player.Player;
import me.adeane6.model.playerseason.PlayerSeason;
import me.adeane6.model.season.Season;
import me.adeane6.model.status.Status;
import me.adeane6.model.wrapper.Data;
import me.adeane6.model.wrapper.ResponseData;
import me.adeane6.model.wrapper.ResponseDataList;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface PUBGInterface {

    @GET(Endpoints.PLAYER_PATH)
    Call<ResponseDataList<Player>> getPlayersByNames(@Path("shard") String shard,
                                                     @Query("filter[playerNames]") String playerNames);

    @GET(Endpoints.PLAYER_PATH)
    Call<ResponseDataList<Player>> getPlayersByIds(@Path("shard") String shard,
                                                         @Query("filter[playerIds]") String playerIds);

    @GET(Endpoints.PLAYER_ID_PATH)
    Call<ResponseData<Player>> getPlayer(@Path("shard") String shard, @Path("id") String id);

    @GET(Endpoints.PLAYER_SEASONS_PATH)
    Call<ResponseData<PlayerSeason>> getPlayerSeason(@Path("shard") String shard, @Path("id") String playerId,
                                                     @Path("seasonId") String seasonId);

    @GET(Endpoints.STATUS_PATH)
    Call<Data<Status>> getStatus();

    @GET(Endpoints.MATCH_PATH)
    Call<MatchWrapper> getMatch(@Path("shard") String shard, @Path("id") String id);

    @GET
    Call<List<EventBase>> getTelemetry(@Url String url);

    @GET(Endpoints.SEASONS_PATH)
    Call<ResponseDataList<Season>> getSeasons(@Path("shard") String shard);
}
