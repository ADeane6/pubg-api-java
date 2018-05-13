package me.adeane6.model.asset;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeane6.model.Entity;

@Getter
@Setter
@NoArgsConstructor
public class Asset extends Entity {

    private AssetAttributes attributes;
}
