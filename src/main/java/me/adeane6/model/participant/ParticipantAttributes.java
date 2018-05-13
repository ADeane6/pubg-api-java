package me.adeane6.model.participant;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ParticipantAttributes {

    private String actor;
    private String shardId;
    private ParticipantStats stats;
}
