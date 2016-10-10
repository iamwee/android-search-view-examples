package com.example.zeon.searchviewdemo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created and Developed by Zeon.
 */

public class MainAdapter extends BaseAdapter{

    private List<String> list;

    public MainAdapter() {
        list = new ArrayList<>();
        list.add("Clear Search");
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public String getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public void addData(String s){
        list.add(getCount()-1, s);
        notifyDataSetChanged();
    }

    public void removeAll(){
        list.clear();
        list.add("Clear Search");
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv;
        if(convertView == null){
            tv = new TextView(parent.getContext());
            tv.setPadding(32, 32, 32, 32);
        } else {
            tv = (TextView) convertView;
        }
        tv.setText(getItem(position));
        return tv;
    }
}
