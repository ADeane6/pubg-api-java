package me.adeane6.model.Telemetry.Event;

import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.object.Character;

/**
 * TelemetryEvent including a character
 */
@Setter
@Getter
public abstract class EventCharacter extends EventBase {

    private Character character;

    public EventCharacter() {
        super();
    }
}
