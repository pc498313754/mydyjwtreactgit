package com.example.jwtsecutity.mapper;


import com.example.jwtsecutity.entity.SensorInfo;

import java.util.List;

public interface SensorInfoMapper {
    SensorInfo getSensorInfoByID(long id);

    List<SensorInfo> getSensorInfosByAnimalAndPen(long animalHouseID, long penID);

    int insertSensorInfo(SensorInfo sensorInfo);

    int updateSensorInfo(SensorInfo sensorInfo);
}
