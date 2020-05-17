package com.example.jwtsecutity.mapper;

import com.example.jwtsecutity.entity.AnimalHouseInfo;
import com.example.jwtsecutity.entity.FarmInfo;

import java.util.List;

public interface AnimalHouseInfoMapper {
    AnimalHouseInfo getAnimalHouseByID(long id);

    List<AnimalHouseInfo> getAnimalHousesByFarm(String farm_UUID);
    List<AnimalHouseInfo>  getAnimalHousesByPlace(String districtID, String cityID, String provineceID);
    int insertAnimalHouse(AnimalHouseInfo farmInfo);

    int updateAnimalHouse(AnimalHouseInfo farmInfo);
}
