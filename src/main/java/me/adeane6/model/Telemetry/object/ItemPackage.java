package me.adeane6.model.Telemetry.object;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ItemPackage {

    private String itemPackageId;
    private Location location;
    private List<Item> items;
}
