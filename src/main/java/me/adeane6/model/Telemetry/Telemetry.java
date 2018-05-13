package me.adeane6.model.Telemetry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.adeane6.model.Telemetry.Event.EventBase;

import java.util.List;

@Getter
@AllArgsConstructor
public class Telemetry {

    private final List<EventBase> telemetryEvents;

}
