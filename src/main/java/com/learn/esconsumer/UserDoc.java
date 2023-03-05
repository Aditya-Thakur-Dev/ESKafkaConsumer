package com.learn.esconsumer;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.integration.annotation.BridgeTo;

@Document(indexName = "kafkauser")
public class UserDoc {

    @Id
    private int id;

    @Field
    private String name;

    @Field
    private String date;

    private UserDoc id(int id){
        this.id = id;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private UserDoc name(String name){
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private UserDoc date(String date){
        this.date = date;
        return this;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
