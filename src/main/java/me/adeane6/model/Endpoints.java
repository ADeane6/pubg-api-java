package me.adeane6.model;

/**
 * Created by ashley on 05/04/2018.
 */
public class Endpoints {
    public static final String BASE ="https://api.playbattlegrounds.com";
    private static final String STATUS = "/status";
    private static final String SHARD = "/shards/{shard}";
    private static final String PLAYERS = "/players";
    private static final String PLAYERS_ID = "/players/{playerId}";
    private static final String SEASONS = "/seasons";
    private static final String SEASONS_ID = "/seasons/{seasonId}";
    private static final String MATCH = "/matches/{matchId}";


    public static final String STATUS_PATH = STATUS;
    public static final String PLAYER_PATH = SHARD + PLAYERS;
    public static final String PLAYER_ID_PATH = SHARD + PLAYERS_ID;
    public static final String PLAYER_SEASONS_PATH = SHARD + PLAYERS_ID + SEASONS_ID;
    public static final String MATCH_PATH = SHARD + MATCH;
    public static final String SEASONS_PATH = SHARD + SEASONS;
}
