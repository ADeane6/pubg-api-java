package me.adeane6.model.Telemetry.Event;

import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.object.Item;

/**
 * TelemetryEvent including a character and an item
 */
@Getter
@Setter
public abstract class EventCharacterItem extends EventBase {

    private Item item;

    public EventCharacterItem() {
        super();
    }
}
