//package com.example.ldjg.homepageapplication.Record;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ImageView;
//
//import com.example.ldjg.homepageapplication.R;
//import com.example.ldjg.homepageapplication.database.Type;
//
//public class AddTypeActivity extends AppCompatActivity implements View.OnClickListener{
//        int t;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_add_type);
//
//        ImageView imageView=(ImageView)findViewById(R.id.type_add_image);
//        Button button=(Button)findViewById(R.id.type_add_button);
//        button.setOnClickListener(this);
//        Intent intent=getIntent();
//       t=intent.getIntExtra("istype",t);
//    }
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.type_add_button:
//                EditText text=(EditText)findViewById(R.id.type_add_name);
//                String s=text.getText().toString();
//                Type type=new Type();
//                type.setImage("11");
//                type.setTypename(s);
//                type.setDotype(t);
//                type.save();
//                startActivity(new Intent(AddTypeActivity.this, JinewActivity.class));
//            default:
//                break;
//        }
//    }
//}
