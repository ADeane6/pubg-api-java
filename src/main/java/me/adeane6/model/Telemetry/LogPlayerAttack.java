package me.adeane6.model.Telemetry;

import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.Event.EventBase;
import me.adeane6.model.Telemetry.object.Character;
import me.adeane6.model.Telemetry.object.Item;
import me.adeane6.model.Telemetry.object.Vehicle;

@Getter
@Setter
public class LogPlayerAttack extends EventBase {

    private Integer attackId;
    private Character attacker;
    private AttackType attackType;
    private Item weapon;
    private Vehicle vehicle;

    public LogPlayerAttack() {
        super();
    }
}
