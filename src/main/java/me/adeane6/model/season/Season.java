package me.adeane6.model.season;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeane6.model.Entity;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Season extends Entity {

    private SeasonAttributes attributes;
}
