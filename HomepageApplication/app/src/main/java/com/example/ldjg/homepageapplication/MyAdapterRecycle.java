//package com.example.ldjg.homepageapplication;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by ldjg on 2017/12/3.
// */
//
//public class MyAdapterRecycle extends RecyclerView.Adapter<MyAdapterRecycle.ViewHolder> {
//
////    private List<Expenditure> expenditureList;
////    private LayoutInflater inflater;
////    public MyAdapterRecycle(){}
////    public MyAdapterRecycle(List<Expenditure> expenditureList, Context context){
////        this.expenditureList=expenditureList;
////        this.inflater=LayoutInflater.from(context);
////    }
//MainActivity mainActivity=new MainActivity();
//ArrayList<Expenditure> expenditures=mainActivity.initdata();
//
//    @Override
//    public MyAdapterRecycle.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//
//        ViewHolder holder = new ViewHolder(LayoutInflater.from(
//                MainActivity.this).inflate(R.layout.recycler_view, parent,
//                false));
//        return holder;
//    }
//
//
//
//    @Override
//    public void onBindViewHolder(MyAdapterRecycle.ViewHolder holder, int position) {
//        Expenditure expenditure=new Expenditure();
//       expenditure=expenditures.get(position);
//        holder.imageView.setImageResource(expenditure.getPhoto());
//        holder.textView_data.setText(expenditure.getData());
//        holder.textView_money.setText(expenditure.getMoney());
//        holder.textView_name.setText(expenditure.getName());
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return expenditures.size();
//    }
//
//    public static class ViewHolder extends RecyclerView.ViewHolder{
//        ImageView imageView;
//        TextView textView_name;
//        TextView textView_data;
//        TextView textView_money;
//        public ViewHolder(View itemView) {
//            super(itemView);
//           imageView=(ImageView)itemView.findViewById(R.id.image_photo);
//           textView_name=(TextView)itemView.findViewById(R.id.name);
//           textView_data=(TextView)itemView.findViewById(R.id.date);
//           textView_money=(TextView)itemView.findViewById(R.id.money);
//        }
//
//
//    }
//}
