package com.tinh.cb2_listview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

public class CustomAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater = null;
    ArrayList<hocsinh> danhsach = new ArrayList<>();
    HashMap<Object,Integer> hashMap = new HashMap<>();

    public CustomAdapter(Context context, ArrayList<hocsinh> danhsach) {
        this.context = context;
        this.danhsach = danhsach;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        for(int i=0;i<danhsach.size();i++){
            hashMap.put(danhsach.get(i),i);
        }
    }
    @Override
    public int getCount() {
        return danhsach.size();
    }
    @Override
    public Object getItem(int position) {
        return danhsach.get(position);
    }
    @Override
    public long getItemId(int position) {
        if(position<0||position>=danhsach.size()){
            return -1;
        }
        Object key = getItem(position);
        return hashMap.get(key);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = inflater.inflate(R.layout.custom_adapter,parent,false);
        }
        ImageView hinh = (ImageView)convertView.findViewById(R.id.image);
        TextView ten = (TextView) convertView.findViewById(R.id.name);
        TextView tuoi = (TextView)convertView.findViewById(R.id.tuoi);
        ten.setText(danhsach.get(position).ten);
        tuoi.setText(String.valueOf(danhsach.get(position).tuoi));
        hinh.setImageResource(danhsach.get(position).anh);
        return convertView;
    }
}
