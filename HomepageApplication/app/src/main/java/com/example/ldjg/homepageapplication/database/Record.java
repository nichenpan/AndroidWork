package com.example.ldjg.homepageapplication.database;

import org.litepal.crud.DataSupport;

/**
 * Created by ldjg on 2017/12/7.
 */

public class Record extends DataSupport{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public boolean isType() {
//        return type;
//    }

    public void setType(String Type) {
        this.type = type;
    }

    public  String getType(){return type;}

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return this.money;
    }

    public void setMoney(String money) {
        this.money = money;
    }



//    public String getTypeName() {
//        return typeName;
//    }
//
//    public void setTypeName(String typeName) {
//        this.typeName = typeName;
//    }
//
//    private String typeName;
    private String type;
    private String date;
    private String name;
    private String money;



}
