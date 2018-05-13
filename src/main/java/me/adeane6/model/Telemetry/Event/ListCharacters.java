package me.adeane6.model.Telemetry.Event;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * TelemetryEvent related to a list of characters
 */
@Getter
@Setter
public abstract class ListCharacters extends EventBase {

    private List<Character> characters;

    public ListCharacters() {
        super();
    }
}
