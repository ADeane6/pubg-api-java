package me.adeane6.model.player;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeane6.model.asset.Asset;
import me.adeane6.model.match.Match;
import me.adeane6.model.wrapper.DataList;

@Getter
@Setter
@NoArgsConstructor
public class PlayerRelationships {

    private DataList<Match> matches;
    private DataList<Asset> assets;
}
