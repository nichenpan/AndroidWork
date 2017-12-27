package com.example.ldjg.homepageapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ldjg on 2017/11/17.
 */

public class MyAdapter extends BaseAdapter {
    private List<Expenditure> expenditureList;
    private LayoutInflater inflater;
    public MyAdapter(){}
    public MyAdapter(List<Expenditure> expenditureList, Context context){
        this.expenditureList=expenditureList;
        this.inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return expenditureList==null?0:expenditureList.size();
    }

    @Override
    public Expenditure getItem(int position) {
        return expenditureList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View view=inflater.inflate(R.layout.listview,null);
        Expenditure expenditure=new Expenditure();
        expenditure=getItem(position);

        ImageView imageView=(ImageView)view.findViewById(R.id.image_photo);
        TextView textView_name=(TextView)view.findViewById(R.id.name);
        TextView textView_data=(TextView)view.findViewById(R.id.date);
        TextView textView_money=(TextView)view.findViewById(R.id.money);
        imageView.setImageResource(expenditure.getPhoto());
        textView_data.setText(expenditure.getData());
        textView_money.setText(expenditure.getMoney());
        textView_name.setText(expenditure.getName());
            return view;


    }
}
