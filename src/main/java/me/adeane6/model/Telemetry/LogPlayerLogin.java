package me.adeane6.model.Telemetry;

import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.Event.Account;

@Getter
@Setter
public class LogPlayerLogin extends Account {

    private Boolean result;
    private String errorMessage;

    public LogPlayerLogin() {
        super();
    }
}
