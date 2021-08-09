package com.tinh.scrollveiw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class food_adaper extends ArrayAdapter<food> {
    private Context mcontext;
    private  int mResource;
    public food_adaper(@NonNull Context context, int resource, @NonNull ArrayList<food> objects) {
        super(context, resource, objects);
        this.mcontext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mcontext);
        convertView = layoutInflater.inflate(mResource,parent,false);
        ImageView imageView = convertView.findViewById(R.id.image);
        TextView textView = convertView.findViewById(R.id.name);
        imageView.setImageResource(getItem(position).getImage());
        textView.setText(getItem(position).getName());
        return convertView;
    }
}
