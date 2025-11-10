package com.gordeev.dto;


import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Location {
    private String name;
    private String region;
    private String country;
    private Double lat;
    private Double lon;
    @SerializedName("tz_id")
    private String tzId;
    @SerializedName("localtime_epoch")
    private Long localtimeEpoch;
    private String localtime;
}
