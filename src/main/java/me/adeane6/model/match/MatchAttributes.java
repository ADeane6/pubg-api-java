package me.adeane6.model.match;


import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.GameMode;
import me.adeane6.model.Map;

import java.time.ZonedDateTime;

@Getter
@Setter
public class MatchAttributes {

    private ZonedDateTime createdAt;
    private Integer duration;
    private GameMode gameMode;
    private String patchVersion;
    private String shardId;
    private String titleId;
    private Map mapName;
}