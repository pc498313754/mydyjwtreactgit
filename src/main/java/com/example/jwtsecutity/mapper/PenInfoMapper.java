package com.example.jwtsecutity.mapper;


import com.example.jwtsecutity.entity.PenInfo;

import java.util.List;

public interface PenInfoMapper {
    PenInfo getPenInfoByID(long id);

    List<PenInfo> getPenInfosByAnimal(long animalHouseID);

    //
    List<PenInfo> getPenInfosByPlace(String districtID, String cityID, String provineceID);

    int insertPenInfo(PenInfo penInfo);

    int updatePenInfo(PenInfo penInfo);
}
