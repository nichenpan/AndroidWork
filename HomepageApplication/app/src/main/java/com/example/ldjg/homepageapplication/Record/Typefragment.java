package com.example.ldjg.homepageapplication.Record;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.ldjg.homepageapplication.R;

/**
 * Created by ldjg on 2017/12/7.
 */

public class Typefragment extends Fragment {
    private SendMessageCommunitor sendMessage;
//    private static RadioButton canyin;
//    private static RadioButton chuxing;
//    private static RadioButton lvyou;
//    private static RadioButton other;
//    private static RadioGroup RBzhichu;

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static String name;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.typefragment, container, false);

        return view;
    }


//    public static void SendName (){
//        RadioGroup RR=RBzhichu.findViewById(R.id.RB_zhichu);
//        canyin.findViewById(R.id.canyin);
//        chuxing.findViewById(R.id.chuxing);
//        lvyou.findViewById(R.id.lvyou);
//        other.findViewById(R.id.other);
//        RR.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (canyin.getId() == checkedId) {
//                    name = canyin.getText().toString();
//                }
//                else if (chuxing.getId() == checkedId) {
//                    name = chuxing.getText().toString();
//                }
//                else if (lvyou.getId() == checkedId) {
//                    name = lvyou.getText().toString();
//                }
//                else if (other.getId() == checkedId) {
//                    name = other.getText().toString();
//                }
//            }
//        });
//
//
//        }


}
