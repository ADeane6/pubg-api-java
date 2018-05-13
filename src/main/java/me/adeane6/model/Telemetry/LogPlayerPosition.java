package me.adeane6.model.Telemetry;

import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.Event.Character;

@Getter
@Setter
public class LogPlayerPosition extends Character {
    private Float elapsedTime;
    private Integer numAlivePlayers;

    public LogPlayerPosition() {
        super();
    }
}
