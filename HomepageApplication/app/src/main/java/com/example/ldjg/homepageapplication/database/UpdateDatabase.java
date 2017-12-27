//package com.example.ldjg.homepageapplication.database;
//
///**
// * Created by ncp on 2017/12/21.
// */
//import com.example.ldjg.homepageapplication.Expenditure;
//
//import java.util.ArrayList;
//
//public class UpdateDatabase {
//    public static void insertTodatabase(Expenditure expenditure){
//        Record record=new Record();
//        record.setType(expenditure.isType());
//        record.setTypeName(expenditure.getName());
//        record.setMoney(expenditure.getMoney());
//        record.setDate(expenditure.getData());
////        record.setName(expenditure.getName());
//        record.save();
//    }
//    public static void insertTodatabase2(Expenditure expenditure){
//        Record record=new Record();
//        record.setType(expenditure.isType());
//        record.setTypeName(expenditure.getName());
//        record.setMoney(expenditure.getMoney());
//        record.setDate(expenditure.getData());
//        record.saveOrUpdate("id=?" , String.valueOf(expenditure.getId()));
//
//    }
//}
