package com.example.jwtsecutity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.jwtsecutity"})
@EnableCaching //开启基于注解的缓存
public class JwtsecutityApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtsecutityApplication.class, args);
    }

}
