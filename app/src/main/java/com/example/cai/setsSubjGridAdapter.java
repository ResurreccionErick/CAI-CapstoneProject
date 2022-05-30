package com.example.cai;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class setsSubjGridAdapter extends BaseAdapter {

    private int sets = 0;

    public setsSubjGridAdapter(int sets) {
        this.sets = sets;
    }

    @Override
    public int getCount() {
        return sets;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if(convertView==null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sets_subject_item,parent,false);
        }else{
            view = convertView;
        }

        //setting name of sets
        String name = (String) ((TextView) view.findViewById(R.id.tvSetsName)).getText();
        ((TextView) view.findViewById(R.id.tvSetsName)).setText(name);
        ((TextView) view.findViewById(R.id.tvSetsID)).setText("ID: " + String.valueOf(position+1));

        return view;
    }
}