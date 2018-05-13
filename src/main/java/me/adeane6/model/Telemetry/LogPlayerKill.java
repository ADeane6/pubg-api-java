package me.adeane6.model.Telemetry;

import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.Event.EventBase;
import me.adeane6.model.Telemetry.object.Character;

@Getter
@Setter
public class LogPlayerKill extends EventBase {

    private Integer attackId;
    private Character killer;
    private Character victim;
    private String damageTypeCategory;
    private String damageCauserName;
    private Float distance;

    public LogPlayerKill() {
        super();
    }
}
