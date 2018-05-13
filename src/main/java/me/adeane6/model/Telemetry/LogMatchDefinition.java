package me.adeane6.model.Telemetry;

import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.Event.EventBase;

@Getter
@Setter
public class LogMatchDefinition extends EventBase {

    private String matchId;
    private String pingQuality;

    public LogMatchDefinition() {
        super();
    }
}
