package com.example.jwtsecutity.controller;


import com.example.jwtsecutity.entity.PenInfo;
import com.example.jwtsecutity.mapper.PenInfoMapper;
import com.example.jwtsecutity.services.PenInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@RestController
public class PenInfoController {
    @Resource
    PenInfoService penInfoService;
    @RequestMapping(value = "/api/pen/{id}")
    public Object getPenOne(@PathVariable Integer id ) {

        System.out.println("pen:"+id);
        Object ss = penInfoService.getFarmByIDService(id);
        System.out.println(ss);
        return ss;
    }
    @RequestMapping(value = "/api/pen/list",method = RequestMethod.GET)
    public Object getPenList(@RequestParam long animalHouse ) {
        System.out.println("animal:"+animalHouse );
        Object ss = penInfoService.GetPenInfosByAnimalHouseIDService(animalHouse);

        return ss;
    }

    @RequestMapping(value = "/api/pen/listplace",method = RequestMethod.GET)
    public Object getPenListByPlace(@RequestParam String districtID,@RequestParam String cityID, @RequestParam String provineceID  ) {
        System.out.println("districtID:"+districtID );
        Object ss = penInfoService.GetPenInfosByPlaceService(districtID,cityID,provineceID);

        return ss;
    }

    @PostMapping(value = "/api/pen/add")
    public Object insertPen(@RequestBody PenInfo penInfo ) {
        System.out.println("/api/pen/add");
        Object ss = penInfoService.insertPenInfoService(penInfo);
        System.out.println(ss);
        return ss;
    }
    @PostMapping(value = "/api/pen/update")
    public Object updatePen(@RequestBody PenInfo penInfo ) {
        System.out.println("/api/pen/update");
        Object ss = penInfoService.updatePenInfoService(penInfo);
        System.out.println(ss);
        return ss;
    }
}
