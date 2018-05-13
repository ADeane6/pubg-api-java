package me.adeane6.model.playerseason;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GameModeStatsWrapper {

    private GameModeStats duo;
    @SerializedName("duo-fpp")
    private GameModeStats duoFpp;
    private GameModeStats solo;
    @SerializedName("solo-fpp")
    private GameModeStats soloFpp;
    private GameModeStats squad;
    @SerializedName("squad-fpp")
    private GameModeStats squadFpp;
}
