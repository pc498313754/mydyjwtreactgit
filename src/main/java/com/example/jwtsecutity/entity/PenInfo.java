package com.example.jwtsecutity.entity;

import lombok.Data;
import org.joda.time.DateTime;



@Data
public class PenInfo {
    long id;
    String pen_ID;
    String name;
    String code;
    long animalHouseID;
    String penType;
    String penInfo;
    String createTime;
    String   updateTime;
    String reMark;

}
