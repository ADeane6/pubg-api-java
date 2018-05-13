package me.adeane6.model.player;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor
public class PlayerAttributes {

    private ZonedDateTime createdAt;
    private String name;
    private String patchVersion;
    private String shardId;
    private String titleId;
}
