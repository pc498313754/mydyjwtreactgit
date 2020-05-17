package com.example.jwtsecutity.services;

import com.alibaba.fastjson.JSON;
import com.example.jwtsecutity.entity.AnimalHouseInfo;
import com.example.jwtsecutity.mapper.AnimalHouseInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AnimalHouseInfoService {

    @Resource
    AnimalHouseInfoMapper animalHouseInfoMapper;

    public Object getAnimalByIDService(long id) {
        AnimalHouseInfo ss = animalHouseInfoMapper.getAnimalHouseByID(id);

        return JSON.toJSON(ss);
    }

    public Object GetFarmsByFarmService(String farm_UUID) {
        List<AnimalHouseInfo> ss = animalHouseInfoMapper.getAnimalHousesByFarm(farm_UUID);

        return JSON.toJSON(ss);
    }
//getAnimalHousesByPlace(String districtID, String cityID, String provineceID);
    public Object GetFarmsByPlaceService(String districtID, String cityID, String provineceID) {
// List<AnimalHouseInfo>
        List<AnimalHouseInfo>     ss = animalHouseInfoMapper.getAnimalHousesByPlace( districtID,  cityID,  provineceID);
        return JSON.toJSON(ss);
    }
    public Object insertFarmService(AnimalHouseInfo animalHouseInfo) {
        int ss = animalHouseInfoMapper.insertAnimalHouse(animalHouseInfo);

        return JSON.toJSON(ss);
    }

    public Object updateFarmService(AnimalHouseInfo animalHouseInfo) {
        int ss = animalHouseInfoMapper.updateAnimalHouse(animalHouseInfo);

        return JSON.toJSON(ss);
    }


}
