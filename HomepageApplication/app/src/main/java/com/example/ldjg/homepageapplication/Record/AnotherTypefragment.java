package com.example.ldjg.homepageapplication.Record;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ldjg.homepageapplication.R;

/**
 * Created by ldjg on 2017/12/8.
 */

public class AnotherTypefragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.anothertypefragment, container, false);
        return view;
    }
}
