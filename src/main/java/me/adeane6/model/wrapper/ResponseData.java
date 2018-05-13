package me.adeane6.model.wrapper;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeane6.model.Links;

@Getter
@Setter
@NoArgsConstructor
public class ResponseData<T> extends Data<T> {

    private Links links;
}
