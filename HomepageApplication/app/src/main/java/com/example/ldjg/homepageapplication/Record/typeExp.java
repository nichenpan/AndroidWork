package com.example.ldjg.homepageapplication.Record;

/**
 * Created by ldjg on 2017/12/14.
 */

public class typeExp {
    private String name;
    private int image;
public typeExp(int image,String name){
    this.name=name;
    this.image=image;
}
public typeExp(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
