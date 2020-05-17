package com.example.jwtsecutity.controller;

import com.example.jwtsecutity.entity.FarmInfo;
import com.example.jwtsecutity.mapper.FarmInfoMapper;
import com.example.jwtsecutity.services.FarmInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Random;

@RestController
public class FarmInfoController {
    @Resource
    FarmInfoService farmInfoService;
@Resource
    FarmInfoMapper farmInfoMapper;
    @RequestMapping(value = "/api/farm/{uuid}")
    public Object getFarmOne(@PathVariable String uuid ) {

        System.out.println("farm:"+uuid);
        Object ss = farmInfoService.getFarmByIDService(uuid);
       //传感器添加测试数据
        Random r=new Random(1);
        Random r2=new Random();
//        for(int i=0;i<1000;i++)
//        {
//            int ran1=r.nextInt(3)+1;
//            int ran2=r.nextInt(40);
//            farmInfoMapper.insertwendu(ran1+"","2",ran2+"","2");
//            System.out.println(ran2);
//        }

        final long timeInterval = 10000;
        Runnable runnable = new Runnable() {
            public void run() {
                while (true) {
                    // ------- code for task to run
                    // ------- 要运行的任务代码
                    System.out.println("Hello, stranger");
                    // ------- ends here
                    try {
                        // sleep()：同步延迟数据，并且会阻塞线程
                        int ran1=r.nextInt(3)+1;
                        int ran2=r.nextInt(100)-50;
                        farmInfoMapper.insertwendu(ran1+"",ran1+"",ran2+"",ran1+"");
                        System.out.println(ran2);
                        Thread.sleep(timeInterval);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        //创建定时器
        Thread thread = new Thread(runnable);
        //开始执行
        thread.start();




      System.out.println(ss);
        return ss;
    }
//@PathVariable String districtID,@PathVariable String cityID, @v String provineceID  @PathVariable
    @RequestMapping(value = "/api/farm/list",method = RequestMethod.GET)
    public Object getFarmList( @RequestParam String districtID,@RequestParam String cityID, @RequestParam String provineceID ) {
        System.out.println("districtID:"+districtID +"   cityID:"+cityID+"  provineceID:"+provineceID);
        Object ss = farmInfoService.GetFarmsByPositionService(districtID,cityID,provineceID);

        return ss;
    }


    @RequestMapping(value = "/api/farm/listcount",method = RequestMethod.GET)
    public Object getFarmListCount( @RequestParam String districtID,@RequestParam String cityID, @RequestParam String provineceID ) {
        System.out.println("listcount  districtID:"+districtID +"   cityID:"+cityID+"  provineceID:"+provineceID);
        Object ss = farmInfoService.GetFarmsByCountService(districtID,cityID,provineceID);

        return ss;
    }

    @PostMapping(value = "/api/farm/add")
    public Object insertFarm(@RequestBody FarmInfo farmInfo ) {
        System.out.println("/farm/add");
        Object ss = farmInfoService.insertFarmService(farmInfo);
        System.out.println(ss);
        return ss;
    }
    @PostMapping(value = "/api/farm/update")
    public Object updateFarm(@RequestBody FarmInfo farmInfo ) {
        System.out.println("/farm/update");
        Object ss = farmInfoService.updateFarmService(farmInfo);
        System.out.println(ss);
        return ss;
    }




}
