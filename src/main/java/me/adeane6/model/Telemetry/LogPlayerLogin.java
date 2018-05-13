package me.adeane6.model.Telemetry;

import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.Event.EventAccount;

@Getter
@Setter
public class LogPlayerLogin extends EventAccount {

    private Boolean result;
    private String errorMessage;

    public LogPlayerLogin() {
        super();
    }
}
