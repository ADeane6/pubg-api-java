package me.adeane6.model.roster;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeane6.model.Entity;
import me.adeane6.model.participant.Participant;
import me.adeane6.model.wrapper.DataList;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class Roster extends Entity {

    private RosterAttributes attributes;
    private RosterRelationships relationships;

    public List<String> getParticipantsIds() {

        DataList<Participant> participants = relationships.getParticipants();

        return participants.getData().stream()
                .map(Entity::getId)
                .collect(Collectors.toList());
    }
}
