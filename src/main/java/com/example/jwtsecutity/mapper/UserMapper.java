package com.example.jwtsecutity.mapper;

import com.example.jwtsecutity.entity.PenInfo;

import java.util.List;

public interface UserMapper {
    PenInfo getUserByID(long id);

    List<PenInfo> getUsersByAnimal(long animalHouseID);

    int insertUser(PenInfo penInfo);

    int updateUser(PenInfo penInfo);
}
