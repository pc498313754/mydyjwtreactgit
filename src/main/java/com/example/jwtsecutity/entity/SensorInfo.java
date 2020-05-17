package com.example.jwtsecutity.entity;

import lombok.Data;
import org.joda.time.DateTime;
@Data
public class SensorInfo {
    long id;
    String sensor_ID;
    String name;
    String type;
    long penID;
    long animalHouseID;
    String createTime;
    String updateTime;
    String reMark;

}
