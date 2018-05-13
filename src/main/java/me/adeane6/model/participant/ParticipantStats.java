package me.adeane6.model.participant;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ParticipantStats {

    @SerializedName("DBNOs")
    private Integer dbnos;
    private Integer assists;
    private Integer boosts;
    private Double damageDealt;
    private String deathType;
    private Integer headshotKills;
    private Integer heals;
    private Integer killPlace;
    private Double killPointsDelta;
    private Integer killStreaks;
    private Integer kills;
    private Integer lastKillPoints;
    private Integer lastWinPoints;
    private Integer longestKill;
    private Double mostDamage;
    private String name;
    private String playerId;
    private Integer revives;
    private Double rideDistance;
    private Integer roadKills;
    private Integer teamKills;
    private Double timeSurvived;
    private Integer vehicleDestroys;
    private Double walkDistance;
    private Integer weaponsAcquired;
    private Integer winPlace;
    private Double winPointsDelta;
}