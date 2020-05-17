package com.example.jwtsecutity.services;

import com.alibaba.fastjson.JSON;
import com.example.jwtsecutity.entity.SensorInfo;
import com.example.jwtsecutity.mapper.SensorInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SensorInfoService {
    @Resource
    SensorInfoMapper sensorInfoMapper;

    public Object getFarmByIDService(long id) {
        SensorInfo ss = sensorInfoMapper.getSensorInfoByID(id);
        return JSON.toJSON(ss);
    }

    public Object GetPenInfosByAnimalHouseIDService(long animalHouseID,long penID) {
        List<SensorInfo> ss = sensorInfoMapper.getSensorInfosByAnimalAndPen(animalHouseID,penID);
        return JSON.toJSON(ss);
    }

    public Object insertPenInfoService(SensorInfo sensorInfo) {
        int ss = sensorInfoMapper.insertSensorInfo(sensorInfo);

        return JSON.toJSON(ss);
    }

    public Object updatePenInfoService(SensorInfo sensorInfo) {
        int ss = sensorInfoMapper.updateSensorInfo(sensorInfo);
        return JSON.toJSON(ss);
    }
}
