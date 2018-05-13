package me.adeane6.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@AllArgsConstructor
public enum Map {
    @SerializedName("Desert_Main") DESERT_MAIN,
    @SerializedName("Erangel_Main") ERANGEL_MAIN,
}
