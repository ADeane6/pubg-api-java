package me.adeane6.model.playerseason;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PlayerSeason {

    private String type;
    private PlayerSeasonAttributes attributes;
    private PlayerSeasonRelationships relationships;
}
