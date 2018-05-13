package me.adeane6.model.roster;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RosterAttributes {

    private String shardId;
    private RosterStats stats;
    private Boolean won;
}