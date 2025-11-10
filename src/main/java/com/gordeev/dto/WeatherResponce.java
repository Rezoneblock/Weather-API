package com.gordeev.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherResponce {
    private Location location;
    private Current current;
}
