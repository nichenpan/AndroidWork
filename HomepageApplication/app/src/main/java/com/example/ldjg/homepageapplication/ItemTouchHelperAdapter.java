package com.example.ldjg.homepageapplication;

/**
 * Created by ldjg on 2017/12/4.
 */

public interface ItemTouchHelperAdapter {
    //数据交换
    void onItemMove(int fromPosition,int toPosition);
    //数据删除
    void onItemDissmiss(int position);
}
