package me.adeane6.model.Telemetry.Event;

import lombok.Getter;
import lombok.Setter;

/**
 * TelemetryEvent related to an account
 */
@Getter
@Setter
public abstract class Account extends EventBase {

    private String accountId;

    public Account() {
        super();
    }
}
