package com.example.jwtsecutity.controller;

import com.example.jwtsecutity.entity.SensorHistory;
import com.example.jwtsecutity.entity.SensorInfo;
import com.example.jwtsecutity.mapper.SensorHistoryMapper;
import com.example.jwtsecutity.mapper.SensorInfoMapper;
import com.example.jwtsecutity.services.SensorHistoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@RestController
public class SensorHistoryController {
    @Resource
    SensorHistoryService sensorHistoryService;
    @RequestMapping(value = "/api/sensorhistory/{id}")
    public Object getPenOne(@PathVariable long id) {

        System.out.println("sensor:"+id);
        Object ss = sensorHistoryService.getFarmByIDService(id);
        System.out.println(ss);
        return ss;
    }
    @RequestMapping(value = "/api/sensorhistory/list",method = RequestMethod.GET)
    public Object getPenList(@RequestParam long sensorInfoID, @RequestParam String startTime, @RequestParam String endTime) {
                 Object ss = sensorHistoryService.GetPenInfosByAnimalHouseIDService(sensorInfoID,startTime,endTime);

        return ss;
    }
    //

    @RequestMapping(value = "/api/sensorhistory/minchart",method = RequestMethod.GET)
    public Object getSensorHistoryByMinChart( @RequestParam String districtID,@RequestParam String cityID, @RequestParam String provineceID, @RequestParam String rowcount) {
      System.out.println("/api/sensorhistory/minchart rowcount:"+rowcount);
        Object ss = sensorHistoryService.getSensorHistoryByMinChartService(districtID,cityID,provineceID,rowcount);
        return ss;
    }
    @PostMapping(value = "/api/sensorhistory/add")
    public Object insertPen(@RequestBody SensorHistory sensorHistory ) {
        System.out.println("/sensor/add");
        Object ss = sensorHistoryService.insertPenInfoService(sensorHistory);
        System.out.println(ss);
        return ss;
    }
//    getSensorHistoryOneService
@RequestMapping(value = "/api/sensorhistory/onechart")
public Object getSensorHistoryOneChart(@RequestParam String sensor) {

    System.out.println("sensor:"+sensor);
    Object ss = sensorHistoryService.getSensorHistoryOneService(sensor);
    System.out.println(ss);
    return ss;
}
    @PostMapping(value = "/api/sensorhistory/update")
    public Object updatePen(@RequestBody SensorHistory sensorHistory ) {
        System.out.println("/sensor/update");
        Object ss = sensorHistoryService.updatePenInfoService(sensorHistory);
        System.out.println(ss);
        return ss;
    }
}
