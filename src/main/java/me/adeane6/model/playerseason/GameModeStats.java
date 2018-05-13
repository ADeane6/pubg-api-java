package me.adeane6.model.playerseason;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GameModeStats {

    private Integer assists;
    private Integer boosts;
    @SerializedName("dBNOs")
    private Integer dbnos;
    private Integer dailyKills;
    private Double damageDealt;
    private Integer days;
    private Integer headshotKills;
    private Integer heals;
    private Double killPoints;
    private Integer kills;
    private Double longestKill;
    private Double longestTimeSurvived;
    private Integer losses;
    private Integer maxKillStreaks;
    private Double mostSurvivalTime;
    private Integer revives;
    private Double rideDistance;
    private Integer roadKills;
    private Integer roundMostKills;
    private Integer roundsPlayed;
    private Integer suicides;
    private Integer teamKills;
    private Double timeSurvived;
    private Integer top10s;
    private Integer vehicleDestroys;
    private Double walkDistance;
    private Integer weaponsAcquired;
    private Integer weeklyKills;
    private Double winPoints;
    private Integer wins;
}