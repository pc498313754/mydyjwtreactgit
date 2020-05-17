package com.example.jwtsecutity.entity;

import lombok.Data;
import java.util.Date;
import org.joda.time.DateTime;

public class AnimalHouseInfo {
    long id;
    String animalHouse_ID;
    String name;
    String code;
    long farm_UUID;
    float longitude;
    float latitude;
    float longitude_WGS84;
    float latitude_WGS84;
    String houseType;
    String farmType;
    String createTime;
    String updateTime;
    String reMark;
    String farmName;
    public long getId() {
        return id;
    }

//    public void setId(long id) {
//        this.id = id;
//    }

    public String getAnimalHouse_ID() {
        return animalHouse_ID;
    }

    public void setAnimalHouse_ID(String animalHouse_ID) {
        this.animalHouse_ID = animalHouse_ID;
    }

    public String getName() {
        return name;
    }
    public String getFarmName() {
        return farmName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getFarm_UUID() {
        return farm_UUID;
    }

    public void setFarm_UUID(long farm_UUID) {
        this.farm_UUID = farm_UUID;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude_WGS84() {
        return longitude_WGS84;
    }

    public void setLongitude_WGS84(float longitude_WGS84) {
        this.longitude_WGS84 = longitude_WGS84;
    }

    public float getLatitude_WGS84() {
        return latitude_WGS84;
    }

    public void setLatitude_WGS84(float latitude_WGS84) {
        this.latitude_WGS84 = latitude_WGS84;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getFarmType() {
        return farmType;
    }

    public void setFarmType(String farmType) {
        this.farmType = farmType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getReMark() {
        return reMark;
    }

    public void setReMark(String reMark) {
        this.reMark = reMark;
    }
}
