package me.adeane6.model.status;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor
public class StatusAttributes {

    private ZonedDateTime releasedAt;
    private String version;
}
