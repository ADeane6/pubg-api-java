package me.adeane6.model.Telemetry;

import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.Event.EventBase;
import me.adeane6.model.Telemetry.object.Vehicle;

@Getter
@Setter
public class LogVehicleDestroy extends EventBase {

    private Integer attackId;
    private Character attacker;
    private Vehicle vehicle;
    private String damageTypeCategory;
    private String damageCauseName;
    private Float distance;

    public LogVehicleDestroy() {
        super();
    }
}
