package me.adeane6.model.Telemetry.Event;

import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.object.Character;

import java.util.List;

/**
 * TelemetryEvent related to a list of characters
 */
@Getter
@Setter
public abstract class EventListCharacters extends EventBase {

    private List<Character> characters;

    public EventListCharacters() {
        super();
    }
}
