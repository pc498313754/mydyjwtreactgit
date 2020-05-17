package com.example.jwtsecutity.services;

import com.alibaba.fastjson.JSON;
import com.example.jwtsecutity.entity.PenInfo;
import com.example.jwtsecutity.mapper.PenInfoMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


import javax.annotation.Resource;
import java.util.List;
@Service
public class PenInfoService {
    @Resource
    PenInfoMapper penInfoMapper;

    public Object getFarmByIDService(long id) {
        PenInfo ss = penInfoMapper.getPenInfoByID(id);

        return JSON.toJSON(ss);
    }

    public Object GetPenInfosByAnimalHouseIDService(long animalHouseID) {
        List<PenInfo> ss = penInfoMapper.getPenInfosByAnimal(animalHouseID);

        return JSON.toJSON(ss);
    }

    public Object GetPenInfosByPlaceService( String districtID,  String cityID,  String provineceID) {
        List<PenInfo> ss = penInfoMapper.getPenInfosByPlace(districtID,cityID,provineceID);

        return JSON.toJSON(ss);
    }

    public Object insertPenInfoService(PenInfo animalHouseInfo) {
        int ss = penInfoMapper.insertPenInfo(animalHouseInfo);

        return JSON.toJSON(ss);
    }

    public Object updatePenInfoService(PenInfo animalHouseInfo) {
        int ss = penInfoMapper.updatePenInfo(animalHouseInfo);
        return JSON.toJSON(ss);
    }
}
