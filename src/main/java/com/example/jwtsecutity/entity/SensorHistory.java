package com.example.jwtsecutity.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
//import  java.sql.Date;
import  java.util.Date;
public class SensorHistory {
    long id;
    String sensorInfoID;
    String UUID;
    String curData;//当前监测数据
    String unit;//不同传感器的监测数据对应不同的单位，如温度为“度”，湿度为“%”
//    @JSONField(format = "yyyy-MM-dd HH:mm")
String createTime;

//    @JSONField(format = "yyyy-MM-dd HH:mm")

    java.util.Date dataDateTime;//数据上报时间

    public long getId() {
        return id;
    }

//    public void setId(long id) {
//        this.id = id;
//    }

    public String getSensorInfoID() {
        return sensorInfoID;
    }

    public void setSensorInfoID(String sensorInfoID) {
        this.sensorInfoID = sensorInfoID;
    }

    public String getCurData() {
        return curData;
    }

    public void setCurData(String curData) {
        this.curData = curData;
    }

    public String getUnit() {
        return unit;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
//    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getDataDateTime() {
        return dataDateTime;
    }

    public void setDataDateTime(Date dataDateTime) {
        this.dataDateTime = dataDateTime;
    }
}
