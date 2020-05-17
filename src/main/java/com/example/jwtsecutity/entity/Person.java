package com.example.jwtsecutity.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.annotation.Generated;

@Document(indexName = "person07",type = "person7", shards = 1, replicas = 0)
public class Person {


    @Id
    private  String id;
    @Field(type = FieldType.Text)
    private String name;
//
    public  Person(){}
    public Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

//    public String getId() {
//        return id;
//    }
//    public void setId(String id) {
//        this.id = id;
//    }
    public void setName(String name) {
        this.name = name;
    }
}
