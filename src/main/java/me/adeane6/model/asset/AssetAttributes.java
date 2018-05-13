package me.adeane6.model.asset;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
public class AssetAttributes {

    @SerializedName("URL")
    private String url;
    private OffsetDateTime createdAt;
    private String description;
    private String name;
}