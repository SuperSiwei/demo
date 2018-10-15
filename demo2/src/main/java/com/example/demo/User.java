package com.example.demo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class User {
    private Long id;
    private String name;
    private String school;
    public static long nextid=1L;
    User(){

    }
    User(long id) {
        this.id=id;
        this.name="unknow";
        this.school="unknow";
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getschool() {
        return school;
    }
    public void setschool(String school) {
        this.school = school;
    }
}
