package me.adeane6.model.Telemetry.Event;

import lombok.Getter;
import lombok.Setter;

/**
 * TelemetryEvent related to an account
 */
@Getter
@Setter
public abstract class EventAccount extends EventBase {

    private String accountId;

    public EventAccount() {
        super();
    }
}
