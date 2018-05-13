package me.adeane6.model.Telemetry.Event;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeane6.model.Telemetry.object.Common;

import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor
public abstract class EventBase {
    @SerializedName("_V")
    private Integer version;
    @SerializedName("_D")
    private ZonedDateTime timestamp;
    @SerializedName("_T")
    private String type;
    private Common common;
}
