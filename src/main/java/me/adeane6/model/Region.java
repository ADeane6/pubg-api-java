package me.adeane6.model;

/**
 * Created by ashley on 05/04/2018.
 */
public enum Region {
    XBOXAS("xbox-as"),
    XBOXEU("xbox-eu"),
    XBOXNA("xbox-na"),
    XBOXOC("xbox-oc"),
    PCKRJP("pc-krjp"),
    PCNA("pc-na"),
    PCEU("pc-eu"),
    PCOC("pc-oc"),
    PCKAKAO("pc-kakao"),
    PCSEA("pc-sea"),
    PCSA("pc-sa"),
    PCAS("pc-as");

    private final String region;

    Region(String region) {
        this.region = region;
    }

    public String toString() {
        return this.region;
    }
}
