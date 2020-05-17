package com.example.jwtsecutity.entity;

import lombok.Data;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

public class FarmInfo implements Serializable {
    @Id
    private long id;
    String UUID;

    private String name;
    private String code;
    private String provineceID;
    private String provineceName;
    private String cityID;
    private String cityName;
    private String districtID;
    private String districtName;
    private String areaName;
    private Float longitude;
    private Float latitude;
    private Float longitude_WGS84;
    private Float latitude_WGS84;
    private String farmType;
    private String company;
    private String leader;
    private String leaderPhone;
    private String createTime;
    private String updateTime;
    private String reMark;

    public FarmInfo() {
    }

    public long getId() {
        return id;
    }


    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getName() {
        return name;
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

    public String getProvineceID() {
        return provineceID;
    }

    public void setProvineceID(String provineceID) {
        this.provineceID = provineceID;
    }

    public String getProvineceName() {
        return provineceName;
    }

    public void setProvineceName(String provineceName) {
        this.provineceName = provineceName;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictID() {
        return districtID;
    }

    public void setDistrictID(String districtID) {
        this.districtID = districtID;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude_WGS84() {
        return longitude_WGS84;
    }

    public void setLongitude_WGS84(Float longitude_WGS84) {
        this.longitude_WGS84 = longitude_WGS84;
    }

    public Float getLatitude_WGS84() {
        return latitude_WGS84;
    }

    public void setLatitude_WGS84(Float latitude_WGS84) {
        this.latitude_WGS84 = latitude_WGS84;
    }

    public String getFarmType() {
        return farmType;
    }

    public void setFarmType(String farmType) {
        this.farmType = farmType;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getLeaderPhone() {
        return leaderPhone;
    }

    public void setLeaderPhone(String leaderPhone) {
        this.leaderPhone = leaderPhone;
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
