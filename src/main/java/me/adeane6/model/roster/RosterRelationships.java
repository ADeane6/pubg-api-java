package me.adeane6.model.roster;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeane6.model.participant.Participant;
import me.adeane6.model.team.Team;
import me.adeane6.model.wrapper.Data;
import me.adeane6.model.wrapper.DataList;

@Getter
@Setter
@NoArgsConstructor
public class RosterRelationships {

    private DataList<Participant> participants;
    private Data<Team> team;
}
