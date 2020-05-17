package com.example.jwtsecutity.controller;

import com.example.jwtsecutity.entity.AnimalHouseInfo;
import com.example.jwtsecutity.entity.FarmInfo;
import com.example.jwtsecutity.mapper.AnimalHouseInfoMapper;
import com.example.jwtsecutity.services.AnimalHouseInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@RestController
public class AnimalHouseInfoController {
    @Resource
    AnimalHouseInfoService animalHouseInfoService;
    @RequestMapping(value = "/api/animal/{id}")
    public Object getAnimalHouseOne(@PathVariable long id ) {

        System.out.println("animal:"+id);
        Object ss = animalHouseInfoService.getAnimalByIDService(id);
        System.out.println(ss);
        return ss;
    }
    @RequestMapping(value = "/api/animal/list",method = RequestMethod.GET)
    public Object getAnimalHouseList(@RequestParam String farm_UUID ) {
        System.out.println("animal:"+farm_UUID );
        Object ss = animalHouseInfoService.GetFarmsByFarmService(farm_UUID);

        return ss;
    }


    @RequestMapping(value = "/api/animal/listbyplace",method = RequestMethod.GET)
    public Object getAnimalHouseListByPlace(@RequestParam String districtID,@RequestParam String cityID, @RequestParam String provineceID ) {
        System.out.println("provineceID:"+provineceID );
        Object ss = animalHouseInfoService.GetFarmsByPlaceService( districtID,  cityID,  provineceID);

        return ss;
    }

    @PostMapping(value = "/animal/add")
    public Object insertAnimalHouse(@RequestBody AnimalHouseInfo animalHouseInfo ) {
        System.out.println("/api/animal/add");
        Object ss = animalHouseInfoService.insertFarmService(animalHouseInfo);
        System.out.println(ss);
        return ss;
    }
    @PostMapping(value = "/api/animal/update")
    public Object updateAnimalHouse(@RequestBody AnimalHouseInfo animalHouseInfo ) {
        System.out.println("/animal/update");
        Object ss = animalHouseInfoService.updateFarmService(animalHouseInfo);
        System.out.println(ss);
        return ss;
    }
}
