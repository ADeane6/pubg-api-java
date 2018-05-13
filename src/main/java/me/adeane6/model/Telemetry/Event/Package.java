package me.adeane6.model.Telemetry.Event;

import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.object.ItemPackage;

/**
 * TelemetryEvent related to a package
 */
@Getter
@Setter
public abstract class Package extends EventBase {

    private ItemPackage itemPackage;

    public Package() {
        super();
    }

}
