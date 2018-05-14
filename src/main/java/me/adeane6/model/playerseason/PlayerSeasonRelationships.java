package me.adeane6.model.playerseason;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeane6.model.match.MatchData;
import me.adeane6.model.player.Player;
import me.adeane6.model.season.Season;
import me.adeane6.model.wrapper.Data;
import me.adeane6.model.wrapper.DataList;

@Getter
@Setter
@NoArgsConstructor
public class PlayerSeasonRelationships {

    private DataList<MatchData> matchesDuoFPP;
    private DataList<MatchData> matchesSquad;
    private DataList<MatchData> matchesSquadFPP;
    private Data<Season> season;
    private Data<Player> player;
    private DataList<MatchData> matchesSolo;
    private DataList<MatchData> matchesSoloFPP;
    private DataList<MatchData> matchesSoloDuo;
}

