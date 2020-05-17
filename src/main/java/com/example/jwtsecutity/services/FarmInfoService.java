package com.example.jwtsecutity.services;

import com.alibaba.fastjson.JSON;
import com.example.jwtsecutity.entity.FarmInfo;
import com.example.jwtsecutity.mapper.FarmInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class FarmInfoService {
    @Resource
    FarmInfoMapper farmInfoMapper;

    public Object getFarmByIDService(String uuid) {
        FarmInfo ss = farmInfoMapper.getFarmByID(uuid);

        return JSON.toJSON(ss);
    }

    public Object GetFarmsByPositionService(String districtID, String cityID, String provineceID) {
        List<FarmInfo> ss = farmInfoMapper.getFarmsByPosition(districtID, cityID, provineceID);

        return JSON.toJSON(ss);
    }

    public Object GetFarmsByCountService(String districtID, String cityID, String provineceID) {
        List<HashMap<String, Object>> ss = farmInfoMapper.getFarmsByCount(districtID, cityID, provineceID);
        Object data = JSON.toJSON(ss);
        System.out.println(data);
        return JSON.toJSON(data);
    }

    public Object insertFarmService(FarmInfo farmInfo) {
        int ss = farmInfoMapper.insertFarm(farmInfo);

        return JSON.toJSON(ss);
    }

    public Object updateFarmService(FarmInfo farmInfo) {
        int ss = farmInfoMapper.updateFarm(farmInfo);

        return JSON.toJSON(ss);
    }

}
