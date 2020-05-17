package com.example.jwtsecutity.utils;

import com.alibaba.fastjson.JSONObject;
import com.example.jwtsecutity.entity.FarmInfo;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderData {
   public static  String readData(HttpServletRequest req)
   {
       try {
           BufferedReader br = new BufferedReader(new InputStreamReader(req.getInputStream()));
           StringBuffer sb = new StringBuffer();
           String s = null;
           while ((s = br.readLine()) != null) {
               sb.append(s);
           }
           return sb.toString();
       } catch (IOException e) {
           e.printStackTrace();
       }
       return "";
   }
}
