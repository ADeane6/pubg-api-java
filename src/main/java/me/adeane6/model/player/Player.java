package me.adeane6.model.player;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeane6.model.Entity;
import me.adeane6.model.Links;
import me.adeane6.model.match.Match;
import me.adeane6.model.wrapper.DataList;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class Player extends Entity {

    private PlayerAttributes attributes;
    private PlayerRelationships relationships;
    private Links links;

    public List<String> getMatchsIds() {
        PlayerRelationships playerRelationships = this.getRelationships();
        DataList<Match> matches = playerRelationships.getMatches();

        return matches.getData().stream()
                .map(Entity::getId)
                .collect(Collectors.toList());
    }
}
