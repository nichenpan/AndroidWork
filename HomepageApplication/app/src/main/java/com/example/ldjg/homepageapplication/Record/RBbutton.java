//package com.example.ldjg.homepageapplication.Record;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//
//import com.example.ldjg.homepageapplication.R;
//
///**
// * Created by ncp on 2017/12/15.
// */
//
//public class RBbutton extends AppCompatActivity {
//    private RadioGroup RBshouru;
//    private RadioButton canyin;
//    private RadioButton chuxing;
//    private RadioButton lvyou;
//    private RadioButton other;
//    private RadioGroup RBzhichu;
//    private RadioButton gongzi;
//    private RadioButton zengzhi;
//    private RadioButton an_other;
//    private static String msg ;
//
//    public static String getMsg() {
//        return msg;
//    }
//
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }
//
//
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.typefragment);
//        initView();
//    }
//    private void initView() {
//        RadioGroup RBzhichu = (RadioGroup) findViewById(R.id.type).findViewById(R.id.RB_zhichu);
//        canyin = (RadioButton) findViewById(R.id.canyin);
//        chuxing = (RadioButton) findViewById(R.id.chuxing);
//        lvyou = (RadioButton) findViewById(R.id.lvyou);
//        other = (RadioButton) findViewById(R.id.other);
//
//        RadioGroup RBshouru = (RadioGroup) findViewById(R.id.type).findViewById(R.id.RB_shouru);
//        gongzi = (RadioButton) findViewById(R.id.gongzi);
//        zengzhi = (RadioButton) findViewById(R.id.zengzhi) ;
//        an_other = (RadioButton) findViewById(R.id.an_other);
//        RBzhichu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (canyin.getId() == checkedId) {
//                    msg = canyin.getText().toString();
//                } else if (chuxing.getId() == checkedId) {
//                    msg = chuxing.getText().toString();
//                } else if (lvyou.getId() == checkedId) {
//                    msg = lvyou.getText().toString();
//                } else if (other.getId() == checkedId) {
//                    msg = other.getText().toString();
//                }
//            }
//        });
//    }
//}
