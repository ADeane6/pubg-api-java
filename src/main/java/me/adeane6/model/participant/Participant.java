package me.adeane6.model.participant;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeane6.model.Entity;

@Getter
@Setter
@NoArgsConstructor
public class Participant extends Entity {

    private ParticipantAttributes attributes;
}
