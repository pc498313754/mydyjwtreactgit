package com.example.jwtsecutity.mapper;


import com.example.jwtsecutity.entity.SensorHistory;

import java.util.List;

public interface SensorHistoryMapper {
    SensorHistory getSensorHistoryByID(long id);

    List<SensorHistory> getSensorHistorys(long sensorInfoID, String startTime, String endTime);

    int insertSensorHistory(SensorHistory sensorHistory);

    int updateSensorHistory(SensorHistory sensorHistory);

    List<SensorHistory> getSensorHistoryByMinChartMapper(String districtID, String cityID, String provineceID,String rowcount);
}
