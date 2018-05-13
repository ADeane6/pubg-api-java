package me.adeane6.model;

/**
 * Created by ashley on 05/04/2018.
 */
public enum Shard {
    XBOX_AS("xbox-as"),
    XBOX_EU("xbox-eu"),
    XBOX_NA("xbox-na"),
    XBOX_OC("xbox-oc"),
    PC_KRJP("pc-krjp"),
    PC_JP("pc-jp"),
    PC_NA("pc-na"),
    PC_EU("pc-eu"),
    PC_RU("pc-ru"),
    PC_OC("pc-oc"),
    PC_KAKAO("pc-kakao"),
    PC_SEA("pc-sea"),
    PC_SA("pc-sa"),
    PC_AS("pc-as");

    private final String region;

    Shard(String region) {
        this.region = region;
    }

    public String toString() {
        return this.region;
    }
}
