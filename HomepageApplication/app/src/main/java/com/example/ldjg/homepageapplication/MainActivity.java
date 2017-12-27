package com.example.ldjg.homepageapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ldjg.homepageapplication.Record.JinewActivity;
import com.example.ldjg.homepageapplication.database.Record;
import com.example.ldjg.homepageapplication.setting.AppSettings;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        initdata();
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapterRecycle myAdapterRecycle=new MyAdapterRecycle();
        mRecyclerView.setAdapter(myAdapterRecycle);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        ItemTouchHelper.Callback callback = new SimpleItemTouchHelperCallback(myAdapterRecycle);
//用Callback构造ItemtouchHelper
        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
//调用ItemTouchHelper的attachToRecyclerView方法建立联系
        touchHelper.attachToRecyclerView(mRecyclerView);
//        mRecyclerView.setLongPressDragEnabled(true);// 开启长按拖拽
        mRecyclerView.setItemViewSwipeEnabled(true);// 开启滑动删除。
//        mRecyclerView.setOnItemMoveListener(onItemMoveListener);// 监听拖拽和侧滑删除，更新UI和数据。
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent=new Intent(MainActivity.this,AppSettings.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.add_record) {
            Intent intent=new Intent(MainActivity.this,JinewActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

      if (id == R.id.nav_gallery) {
          LitePal.getDatabase();

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    protected ArrayList<Expenditure> initdata(){
        List<Record> records= DataSupport.findAll(Record.class);
        ArrayList<Expenditure> expenditures=new ArrayList<>();
        for(Record record:records)
        {
            Expenditure expenditure =new Expenditure();
            expenditure.setData(record.getDate());
            expenditure.setMoney(record.getMoney());
            expenditure.setName(record.getName());
            expenditure.setPhoto(R.mipmap.ic_launcher);
            expenditures.add(expenditure);
        }
        return expenditures;
    }


    class MyAdapterRecycle extends RecyclerView.Adapter<MyAdapterRecycle.ViewHolder> implements ItemTouchHelperAdapter{

        //    private List<Expenditure> expenditureList;
//    private LayoutInflater inflater;
//    public MyAdapterRecycle(){}
//    public MyAdapterRecycle(List<Expenditure> expenditureList, Context context){
//        this.expenditureList=expenditureList;
//        this.inflater=LayoutInflater.from(context);
//    }
//        MainActivity mainActivity=new MainActivity();
        ArrayList<Expenditure> expenditures=initdata();

        @Override
        public MyAdapterRecycle.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            MyAdapterRecycle.ViewHolder holder = new MyAdapterRecycle.ViewHolder(LayoutInflater.from(
                    MainActivity.this).inflate(R.layout.recycler_view, parent,
                    false));
            return holder;
        }



        @Override
        public void onBindViewHolder(MyAdapterRecycle.ViewHolder holder, int position) {
            Expenditure expenditure=new Expenditure();
            expenditure=expenditures.get(position);
            holder.imageView.setImageResource(expenditure.getPhoto());
            holder.textView_data.setText(expenditure.getData());
            holder.textView_money.setText(expenditure.getMoney());
            holder.textView_name.setText(expenditure.getName());

        }

        @Override
        public int getItemCount() {
            return expenditures.size();
        }

        public  class ViewHolder extends RecyclerView.ViewHolder{
            ImageView imageView;
            TextView textView_name;
            TextView textView_data;
            TextView textView_money;
            public ViewHolder(View itemView) {
                super(itemView);
                imageView=(ImageView)itemView.findViewById(R.id.image_photo);
                textView_name=(TextView)itemView.findViewById(R.id.name);
                textView_data=(TextView)itemView.findViewById(R.id.date);
                textView_money=(TextView)itemView.findViewById(R.id.money);
            }


        }
        @Override
        public void onItemMove(int fromPosition, int toPosition) {
            //交换位置
            Collections.swap(expenditures,fromPosition,toPosition);
            notifyItemMoved(fromPosition,toPosition);
        }

        @Override
        public void onItemDissmiss(int position) {
            //移除数据
            expenditures.remove(position);
            notifyItemRemoved(position);
        }
    }

}
