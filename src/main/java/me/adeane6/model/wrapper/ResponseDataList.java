package me.adeane6.model.wrapper;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeane6.model.Links;

@Getter
@Setter
@NoArgsConstructor
public class ResponseDataList<T> extends DataList<T> {

    private Links links;

}
