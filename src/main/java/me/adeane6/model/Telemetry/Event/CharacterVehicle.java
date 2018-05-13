package me.adeane6.model.Telemetry.Event;

import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.object.Vehicle;

/**
 * TelemetryEvent including a character and a vehicle
 */
@Getter
@Setter
public abstract class CharacterVehicle extends EventBase {

    private Vehicle vehicle;

    public CharacterVehicle() {
        super();
    }
}
