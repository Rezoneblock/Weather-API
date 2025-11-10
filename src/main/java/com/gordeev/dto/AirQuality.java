package com.gordeev.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirQuality {
    private Double co;
    private Double no2;
    private Double o3;
    private Integer so2;
    private Double pm2_5;
    private Integer pm10;
    @SerializedName("us-epa-index")
    private Integer usEpaIndex;
    @SerializedName("gb-defra-index")
    private Integer gbDefraIndex;
}
