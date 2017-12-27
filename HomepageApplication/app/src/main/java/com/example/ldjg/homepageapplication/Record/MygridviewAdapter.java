//package com.example.ldjg.homepageapplication.Record;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.example.ldjg.homepageapplication.R;
//
//import java.util.LinkedList;
//import java.util.List;
//
///**
// * Created by ldjg on 2017/12/14.
// */
//
//public class MygridviewAdapter extends BaseAdapter {
//    private LinkedList<typeExp> Avatarlist;
//    private Context mContext;
//    private typeExp type;
//
//    public MygridviewAdapter(LinkedList<typeExp> Avatarlist, Context mContext) {
//        this.Avatarlist = Avatarlist;
//        this.mContext = mContext;
//    }
//
//    @Override
//    public int getCount() {
//        return Avatarlist.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return Avatarlist.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ViewHolder holder;
//        if (convertView == null) {
//            convertView = LayoutInflater.from(mContext).inflate(R.layout.type_recycle_view, parent, false);
//            holder = new ViewHolder();
//            holder.img_avatar = (ImageView) convertView.findViewById(R.id.type_photo);
//            holder.txt_name = (TextView) convertView.findViewById(R.id.type_name);
//            convertView.setTag(holder);
//        } else {
//            holder = (ViewHolder) convertView.getTag();
//        }
//        holder.img_avatar.setBackgroundResource(Avatarlist.get(position).getImage());
//        holder.txt_name.setText(Avatarlist.get(position).getName());
//        return convertView;
//    }
//
//    static class ViewHolder{
//        ImageView img_avatar;
//        TextView txt_name;
//    }
//}
//
