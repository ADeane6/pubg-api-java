package me.adeane6.model.Telemetry.object;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CharacterObj {

    private String name;
    private String teamId;
    private Float health;
    private Location location;
    private Integer ranking;
    private String accountId;
}
