package me.adeane6.model.Telemetry.object;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Vehicle {

    private String vehicleType;
    private String vehicleId;
    private Float healthPercent;
    private Float feulPercent;
}
