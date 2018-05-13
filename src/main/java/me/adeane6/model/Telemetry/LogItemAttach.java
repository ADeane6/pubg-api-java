package me.adeane6.model.Telemetry;

import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.Event.Character;
import me.adeane6.model.Telemetry.object.Item;

@Getter
@Setter
public class LogItemAttach extends Character {

    private Item parentItem;
    private Item childItem;

    public LogItemAttach() {
        super();
    }
}
