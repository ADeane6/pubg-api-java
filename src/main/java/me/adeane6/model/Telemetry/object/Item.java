package me.adeane6.model.Telemetry.object;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Item {

    private String itemId;
    private Integer stackCount;
    private String category;
    private String subCategory;
    private List<String> attachedItems;
}
