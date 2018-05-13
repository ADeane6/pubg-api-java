package me.adeane6.model.Telemetry;

import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.Event.EventCharacter;

@Getter
@Setter
public class LogPlayerPosition extends EventCharacter {
    private Float elapsedTime;
    private Integer numAlivePlayers;

    public LogPlayerPosition() {
        super();
    }
}
