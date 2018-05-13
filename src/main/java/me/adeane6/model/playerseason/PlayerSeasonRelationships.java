package me.adeane6.model.playerseason;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeane6.model.match.Match;
import me.adeane6.model.player.Player;
import me.adeane6.model.season.Season;
import me.adeane6.model.wrapper.Data;
import me.adeane6.model.wrapper.DataList;

@Getter
@Setter
@NoArgsConstructor
public class PlayerSeasonRelationships {

    private DataList<Match> matchesDuoFPP;
    private DataList<Match> matchesSquad;
    private DataList<Match> matchesSquadFPP;
    private Data<Season> season;
    private Data<Player> player;
    private DataList<Match> matchesSolo;
    private DataList<Match> matchesSoloFPP;
    private DataList<Match> matchesSoloDuo;
}

