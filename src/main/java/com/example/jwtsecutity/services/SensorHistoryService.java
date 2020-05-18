package com.example.jwtsecutity.services;

import com.alibaba.fastjson.JSON;
import com.example.jwtsecutity.entity.SensorHistory;

import com.example.jwtsecutity.mapper.SensorHistoryMapper;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;
@Service
public class SensorHistoryService {
    @Resource
    SensorHistoryMapper sensorHistoryMapper;

    public Object getFarmByIDService(long id) {
        SensorHistory ss = sensorHistoryMapper.getSensorHistoryByID(id);
        return JSON.toJSON(ss);
    }

    public Object GetPenInfosByAnimalHouseIDService(long sensorInfoID, String startTime, String endTime) {
        List<SensorHistory> ss = sensorHistoryMapper.getSensorHistorys(sensorInfoID,startTime,endTime);
        return JSON.toJSON(ss);
    }

//     List<SensorHistory>   getSensorHistoryOne(String SensorHistory);
//
public Object getSensorHistoryOneService(String sensorInfoID ) {
    List<SensorHistory> ss = sensorHistoryMapper.getSensorHistoryOneMapper(sensorInfoID);
    return JSON.toJSON(ss);
}
public Object getSensorHistoryByMinChartService(String districtID, String cityID, String provineceID,String rowcount) {
    List<SensorHistory> ss = sensorHistoryMapper.getSensorHistoryByMinChartMapper(districtID, cityID, provineceID, rowcount);
    return JSON.toJSON(ss);
}
    public Object insertPenInfoService(SensorHistory sensorHistory) {
        int ss = sensorHistoryMapper.insertSensorHistory(sensorHistory);

        return JSON.toJSON(ss);
    }

    public Object updatePenInfoService(SensorHistory sensorHistory) {
        int ss = sensorHistoryMapper.updateSensorHistory(sensorHistory);
        return JSON.toJSON(ss);
    }
}
