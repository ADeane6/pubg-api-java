package me.adeane6.model.asset;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor
public class AssetAttributes {

    @SerializedName("URL")
    private String url;
    private ZonedDateTime createdAt;
    private String description;
    private String name;
}