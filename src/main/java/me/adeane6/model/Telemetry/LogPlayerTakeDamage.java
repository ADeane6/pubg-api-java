package me.adeane6.model.Telemetry;

import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.Event.EventCharacter;
import me.adeane6.model.Telemetry.object.Character;

@Getter
@Setter
public class LogPlayerTakeDamage extends EventCharacter {

    private Integer attackId;
    private Character attacker;
    private Character victim;
    private String damageTypeCategory;
    private DamageReason damageReason;
    private Float damage;
    private String damageCauserName;

    public LogPlayerTakeDamage() {
        super();
    }
}
