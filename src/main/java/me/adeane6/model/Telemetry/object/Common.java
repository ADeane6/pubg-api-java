package me.adeane6.model.Telemetry.object;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeane6.model.Map;

@Getter
@Setter
@NoArgsConstructor
public class Common {
    private String matchId;
    private Map mapName;
    private Float isGame;
}
