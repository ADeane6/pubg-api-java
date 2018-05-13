package me.adeane6.model.Telemetry.object;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GameState {

    private Integer elapsedTime;
    private Integer numAliveTeams;
    private Integer numJoinPlayers;
    private Integer numStartPlayers;
    private Integer numAlivePlayers;
    private Location safetyZonePosition;
    private Float safetyZoneRadius;
    private Location poisonGasWarningPosition;
    private Float poisonGasWarningRadius;
    private Location redZonePosition;
    private Float redZoneRadius;
}
