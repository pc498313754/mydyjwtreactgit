package com.example.jwtsecutity.mapper;

import com.example.jwtsecutity.config.auth.MyUserDetails;
import com.example.jwtsecutity.entity.FarmInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;


public interface FarmInfoMapper {
    FarmInfo getFarmByID(String uuid);

    List<FarmInfo> getFarmsByPosition(String districtID, String cityID, String provineceID);
    List<HashMap<String, Object>> getFarmsByCount(String districtID, String cityID, String provineceID);
    int insertFarm(FarmInfo farmInfo);

    int updateFarm(FarmInfo farmInfo);

// insert into Student(S_StuNo,S_Name,S_Sex,S_Height) values ('001','项羽','男','190')
    @Select("insert  into SensorHistory (UUID,sensorInfoID,curData,unit) " +
            "  values (#{UUID}, #{sensorInfoID},#{curData},#{unit})" )
           // "WHERE u.username = #{userId} or u.phone = #{userId}")
    void  insertwendu(@Param("UUID") String UUID,@Param("sensorInfoID") String sensorInfoID,@Param("curData") String curData,
                        @Param("unit") String unit);
}
