package me.adeane6.model.Telemetry;

import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.Event.EventBase;
import me.adeane6.model.Telemetry.object.GameState;

@Getter
@Setter
public class LogGameStatePeriodic extends EventBase {

    private GameState gameState;

    public LogGameStatePeriodic() {
        super();
    }
}
