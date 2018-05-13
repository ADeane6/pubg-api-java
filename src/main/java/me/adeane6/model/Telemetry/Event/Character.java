package me.adeane6.model.Telemetry.Event;

import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.object.CharacterObj;

/**
 * TelemetryEvent including a character
 */
@Setter
@Getter
public abstract class Character extends EventBase {

    private CharacterObj character;

    public Character() {
        super();
    }
}
