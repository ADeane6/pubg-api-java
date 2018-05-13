package me.adeane6.model.match;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeane6.model.Entity;
import me.adeane6.model.Links;

@Getter
@Setter
@NoArgsConstructor
public class Match extends Entity {

    private MatchAttributes attributes;
    private MatchRelationships relationships;
    private Links links;
}
