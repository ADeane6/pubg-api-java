package me.adeane6.model.status;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeane6.model.Entity;

@Getter
@Setter
@NoArgsConstructor
public class Status extends Entity {

    private StatusAttributes aAttributes;
}
