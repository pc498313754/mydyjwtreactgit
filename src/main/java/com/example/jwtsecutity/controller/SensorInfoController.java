package com.example.jwtsecutity.controller;


import com.example.jwtsecutity.entity.SensorInfo;

import com.example.jwtsecutity.mapper.SensorInfoMapper;
import com.example.jwtsecutity.services.SensorInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@RestController
public class SensorInfoController {
    @Resource
    SensorInfoService sensorInfoService;
    @RequestMapping(value = "/sensor/{id}")
    public Object getPenOne(@PathVariable Integer id ) {

        System.out.println("sensor:"+id);
        Object ss = sensorInfoService.getFarmByIDService(id);
        System.out.println(ss);
        return ss;
    }
    @RequestMapping(value = "/sensor/list",method = RequestMethod.GET)
    public Object getPenList(@RequestParam long animalHouse,@RequestParam long pen ) {
        System.out.println("animal:"+animalHouse );
        Object ss = sensorInfoService.GetPenInfosByAnimalHouseIDService(animalHouse,pen);

        return ss;
    }

    @PostMapping(value = "/sensor/add")
    public Object insertPen(@RequestBody SensorInfo sensorInfo ) {
        System.out.println("/sensor/add");
        Object ss = sensorInfoService.insertPenInfoService(sensorInfo);
        System.out.println(ss);
        return ss;
    }
    @PostMapping(value = "/sensor/update")
    public Object updatePen(@RequestBody SensorInfo sensorInfo ) {
        System.out.println("/sensor/update");
        Object ss = sensorInfoService.updatePenInfoService(sensorInfo);
        System.out.println(ss);
        return ss;
    }
}
