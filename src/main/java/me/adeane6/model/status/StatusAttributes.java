package me.adeane6.model.status;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
public class StatusAttributes {

    private OffsetDateTime releasedAt;
    private String version;
}
