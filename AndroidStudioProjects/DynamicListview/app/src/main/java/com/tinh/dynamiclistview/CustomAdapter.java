package com.tinh.dynamiclistview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.tinh.dynamiclistview.R;
import com.tinh.dynamiclistview.hocsinh;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class CustomAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater = null;
    ArrayList<hocsinh> danhsach = new ArrayList<>();
    ArrayList<hocsinh> tam = new ArrayList<>();
    public CustomAdapter(Context context, ArrayList<hocsinh> danhsach) {
        this.context = context;
        this.danhsach = danhsach;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        this.tam.addAll(danhsach);
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
        return position;
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
    public void filter(String keys){
        danhsach.clear();
        String chartext = keys.toLowerCase(Locale.getDefault());
        chartext = Normalizer.normalize(chartext,Normalizer.Form.NFD);
        chartext = chartext.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        if(chartext.length()==0){
            danhsach.addAll(tam);
        }else{
///*cach1:*/      for (int i=0;i<tam.size();i++){
//                if(tam.get(i).getTen().toLowerCase(Locale.getDefault()).contains(chartext)){
//                    danhsach.add(new hocsinh(tam.get(i).getTen(),tam.get(i).getTuoi(),tam.get(i).getAnh()));
//                }
//
//            }
/*cach2:*/  for(hocsinh studen : tam){ //duyet het cac phan tu trong Arraylist tam
                String s2 = studen.getTen().toLowerCase(Locale.getDefault());   
                s2 = Normalizer.normalize(s2,Normalizer.Form.NFD);
                s2 = s2.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                if (s2.contains(chartext)){
                    danhsach.add(studen);
                }
            }
        }
       notifyDataSetChanged();
    }
}
