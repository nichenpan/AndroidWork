package com.example.ldjg.homepageapplication.Record;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.ldjg.homepageapplication.MainActivity;
import com.example.ldjg.homepageapplication.R;
import com.example.ldjg.homepageapplication.database.Record;

//import android.support.v4.app.Fragment;

public class JinewActivity extends AppCompatActivity implements View.OnClickListener{
    private String msg;
    private  String name;
    private RadioGroup RBshouru;
    private RadioButton canyin;
    private RadioButton chuxing;
    private RadioButton lvyou;
    private RadioButton other;
    private RadioGroup RBzhichu;
    private RadioButton gongzi;
    private RadioButton zengzhi;
    private RadioButton an_other;
    private String type;
    private String typename;
//    String typename = "未指定";
//    boolean type = false;
//    AnotherTypefragment currt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jinew);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button buttonBC = (Button) findViewById(R.id.button_save);
        Button buttonSR = (Button) findViewById(R.id.button_shouru);
        Button buttonZC = (Button) findViewById(R.id.button_zhichu);
//        TabLayout tableLayout=(TabLayout)findViewById(R.id.title_tablayout) ;
//        ViewPager viewPager=(ViewPager)findViewById(R.id.type_viewpage) ;

//        List<Fragment> fragments=new ArrayList<>();
//        fragments.add(new Typefragment());
//        fragments.add(new AnotherTypefragment());
//        TitleFragmentPagerAdapter adapter=new TitleFragmentPagerAdapter(getFragmentManager(),fragments,new String[]{"收入","支出"});
//
//        viewPager.setAdapter(adapter);
//        tableLayout.setupWithViewPager(viewPager);

        RBzhichu=(RadioGroup)this.findViewById(R.id.RB_zhichu);
        canyin = (RadioButton) findViewById(R.id.canyin);
        chuxing = (RadioButton) findViewById(R.id.chuxing);
        other = (RadioButton) findViewById(R.id.other);

        RBshouru = (RadioGroup)findViewById(R.id.RB_shouru);
        gongzi = (RadioButton) findViewById(R.id.gongzi);
        zengzhi = (RadioButton) findViewById(R.id.zengzhi);
        an_other = (RadioButton) findViewById(R.id.an_other);
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (canyin.getId() == checkedId) {
//                    msg = canyin.getText().toString();
//                }
//                else if (chuxing.getId() == checkedId) {
//                    msg = chuxing.getText().toString();
//                }
//                else if (other.getId() == checkedId) {
//                    msg = other.getText().toString();
//                }
//            }
//        });
//        RBshouru.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (gongzi.getId() == checkedId) {
//                    msg = gongzi.getText().toString();
//                }
//                else if (zengzhi.getId() == checkedId) {
//                    msg = zengzhi.getText().toString();
//                }
//                else if (an_other.getId() == checkedId) {
//                    msg = an_other.getText().toString();
//                }
//            }
//        });

        RBzhichu.setOnCheckedChangeListener(new RadioGroupListener1());
        RBshouru.setOnCheckedChangeListener(new RadioGroupListener2());

        buttonBC.setOnClickListener(this);
        buttonSR.setOnClickListener(this);
        buttonZC.setOnClickListener(this);
//        replaceFragment(new Typefragment());


//
//        SimpleDateFormat formatter   =   new   SimpleDateFormat   ("yyyy年MM月dd日   HH:mm:ss");
//        Date curDate =  new Date(System.currentTimeMillis());
        EditText date = (EditText) findViewById(R.id.data_edtext);
        date.setText("2017/12/15");
//        public void setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener listener){
//            sexRadioGroup = (RadioGroup)findViewById(R.id.rgSex);
//            male = (RadioButton)findViewById(R.id.male);
//            female = (RadioButton)findViewById(R.id.female);
//            sexRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//                @Override
//                public void onCheckedChanged(RadioGroup group, int checkedId) {
//                    String msg = "";
//                    if(male.getId()==checkedId){
//                        msg = male.getText().toString();
//                    }
//                    if(female.getId()==checkedId){
//                        msg =female.getText().toString();
//                    }
//                    Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
//                }
//            });
//        Fragment fragment =getFragmentManager().findFragmentByTag("android:switcher:" + R.id.type_viewpage + ":" + viewPager.getCurrentItem());

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button_shouru:

                break;
            case R.id.button_zhichu:

                break;

//                Typefragment.SendName();
//                canyin = (RadioButton) findViewById(R.id.canyin);
//                chuxing = (RadioButton) findViewById(R.id.chuxing);
//                lvyou = (RadioButton) findViewById(R.id.lvyou);
//                other = (RadioButton) findViewById(R.id.other);
//                RBzhichu = (RadioGroup)findViewById(R.id.RB_zhichu);
//                RBzhichu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//                    @Override
//                    public void onCheckedChanged(RadioGroup group, int checkedId) {
//
//                        if (canyin.getId() == checkedId) {
//                            String name = canyin.getText().toString();
//                        }
//                        else if (chuxing.getId() == checkedId) {
//                            String name = chuxing.getText().toString();
//                        }
//                        else if (lvyou.getId() == checkedId) {
//                            String name = lvyou.getText().toString();
//                        }
//                        else if (other.getId() == checkedId) {
//                            String name = other.getText().toString();
//                        }
//                 }
//                });
//                break;
//            case R.id.canyin:
//                EditText TypeName = (EditText) findViewById(R.id.canyin);

            case R.id.button_save:
                EditText editText = (EditText) findViewById(R.id.edit_text_getmoney);
                String money = editText.getText().toString();

                EditText editText_date = (EditText) findViewById(R.id.data_edtext);
                String date = editText_date.getText().toString();



//                RBzhichu=(RadioGroup)findViewById(R.id.RB_zhichu);
//                mOkBt = (Button)findViewById(R.id.ok_bt);
//        给按钮对象设置监听器

//                buttonBC.setOnClickListener(new View.OnClickListener() {
//                    int num = RBzhichu.getCheckedRadioButtonId();
//                    @Override
//                    public void onClick(View v) {
//                        if (num == R.id.canyin) {
//                            name = canyin.getText().toString();
//                        }
//                        else if (num == R.id.chuxing) {
//                            name = chuxing.getText().toString();
//                        }
//                        else if (num == R.id.other) {
//                            name = other.getText().toString();
//                        }
//                    }
//                });

                Record record = new Record();
                record.setType(type);
                record.setName(name);
                record.setDate(date);
                record.setMoney(money);
                record.save();
                startActivity(new Intent(JinewActivity.this, MainActivity.class));
            default:
                break;
        }
    }
    class RadioGroupListener1 implements RadioGroup.OnCheckedChangeListener{
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (checkedId==canyin.getId()){
               name="餐饮";
            }else if (checkedId==lvyou.getId()){
                name="旅游";
            }
            else if (checkedId==other.getId()){
                name="其他支出";
            }
//            else if (checkedId==gongzi.getId()){
//                name="工资";
//            }
//            else if (checkedId==zengzhi.getId()){
//                name="增值";
//            }
//            else if (checkedId==an_other.getId()){
//                name="其他收入";
//            }
        }
        }
    class RadioGroupListener2 implements RadioGroup.OnCheckedChangeListener{
        public void onCheckedChanged(RadioGroup group, int checkedId) {
//            if (checkedId==canyin.getId()){
//                name="餐饮";
//            }else if (checkedId==lvyou.getId()){
//                name="旅游";
//            }
//            else if (checkedId==other.getId()){
//                name="其他支出";
//            }
            if (checkedId==gongzi.getId()){
                name="工资";
            }
            else if (checkedId==zengzhi.getId()){
                name="增值";
            }
            else if (checkedId==an_other.getId()){
                name="其他收入";
//            }
        }
    }
    }
//        private void initView() {
//        RBzhichu=(RadioGroup)findViewById(R.id.RB_zhichu);
//        Button buttonBC = (Button) findViewById(R.id.button_save);
//        buttonBC.setOnClickListener(new View.OnClickListener() {
//            int num = RBzhichu.getCheckedRadioButtonId();
//            @Override
//            public void onClick(View v) {
//                if (num == R.id.canyin) {
//                    name = canyin.getText().toString();
//                }
//                else if (num == R.id.chuxing) {
//                    name = chuxing.getText().toString();
//                }
//                else if (num == R.id.other) {
//                    name = other.getText().toString();
//                }
//            }
//        });
//    }
//    private void replaceFragment(Fragment fragment) {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.replace(R.id.type, fragment);
//        transaction.commit();
//    }
//    public void setTypename(String s){
//        this.typename=s;
//    }
//    public void setType(boolean type){this.type=type;}

//    private void initView1() {
////        初始化按钮对象
//        RadioGroup RBzhichu = (RadioGroup)findViewById(R.id.RB_zhichu);
//        canyin = (RadioButton) findViewById(R.id.canyin);
//        chuxing = (RadioButton) findViewById(R.id.chuxing);
//        other = (RadioButton) findViewById(R.id.other);
//
////        RadioGroup RBshouru = (RadioGroup)findViewById(R.id.RB_shouru);
////        gongzi = (RadioButton) findViewById(R.id.gongzi);
////        zengzhi = (RadioButton) findViewById(R.id.zengzhi);
////        an_other = (RadioButton) findViewById(R.id.an_other);
////        给按钮对象设置监听器
//        RBzhichu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (canyin.getId() == checkedId) {
//                    msg = canyin.getText().toString();
//                }
//                else if (chuxing.getId() == checkedId) {
//                    msg = chuxing.getText().toString();
//                }
//                else if (other.getId() == checkedId) {
//                    msg = other.getText().toString();
//                }
//            }
//        });
//    }
//    private void initView2(){
//        RadioGroup RBshouru = (RadioGroup)findViewById(R.id.RB_shouru);
//        gongzi = (RadioButton) findViewById(R.id.gongzi);
//        zengzhi = (RadioButton) findViewById(R.id.zengzhi);
//        an_other = (RadioButton) findViewById(R.id.an_other);
//        RBshouru.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (gongzi.getId() == checkedId) {
//                    msg = gongzi.getText().toString();
//                }
//                else if (zengzhi.getId() == checkedId) {
//                    msg = zengzhi.getText().toString();
//                }
//                else if (an_other.getId() == checkedId) {
//                    msg = an_other.getText().toString();
//                }
//            }
//        });
//
//    }

}

