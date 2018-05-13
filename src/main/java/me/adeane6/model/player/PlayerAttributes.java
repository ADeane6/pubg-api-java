package me.adeane6.model.player;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
public class PlayerAttributes {

    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private String name;
    private String patchVersion;
    private String shardId;
    private String titleId;
}
