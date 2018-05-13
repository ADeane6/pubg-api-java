package me.adeane6.model.match;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeane6.model.asset.Asset;
import me.adeane6.model.roster.Roster;
import me.adeane6.model.wrapper.DataList;

@Getter
@Setter
@NoArgsConstructor
public class MatchRelationships {

    private DataList<Roster> rosters;
    private DataList<Asset> assets;
}
