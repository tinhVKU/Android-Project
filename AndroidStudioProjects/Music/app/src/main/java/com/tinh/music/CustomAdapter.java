package com.tinh.music;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Locale;

public class CustomAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater = null;
    ArrayList<lvbaihat> danhsach = new ArrayList<>();
    ArrayList<lvbaihat> tam = new ArrayList<>();
    public CustomAdapter(Context context, ArrayList<lvbaihat> danhsach) {
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
            convertView = inflater.inflate(R.layout.dong,parent,false);
        }
        ImageView hinh = (ImageView)convertView.findViewById(R.id.image);
        TextView ten = (TextView) convertView.findViewById(R.id.tenbaihat);
        TextView tuoi = (TextView)convertView.findViewById(R.id.casi);
        ten.setText(danhsach.get(position).ten);
        tuoi.setText(String.valueOf(danhsach.get(position).casi));
        hinh.setImageResource(danhsach.get(position).anh);
        return convertView;
    }
    public void filter(String keys){
        danhsach.clear();
        String chartext = keys.toLowerCase(Locale.getDefault());
        chartext = Normalizer.normalize(chartext,Normalizer.Form.NFD);
        chartext = chartext.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        if(chartext.trim().length()==0){
            danhsach.addAll(tam);
        }else{
///*cach1:*/      for (int i=0;i<tam.size();i++){
//                if(tam.get(i).getTen().toLowerCase(Locale.getDefault()).contains(chartext)){
//                    danhsach.add(new hocsinh(tam.get(i).getTen(),tam.get(i).getTuoi(),tam.get(i).getAnh()));
//                }
//
//            }
/*cach2:*/  for(lvbaihat bainhac : tam){ //duyet het cac phan tu trong Arraylist tam
                String sing = bainhac.getTen().toLowerCase(Locale.getDefault());
                sing = Normalizer.normalize(sing,Normalizer.Form.NFD);
                sing = sing.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                if (sing.contains(chartext)){
                    danhsach.add(bainhac);
                }
            }
        }
        notifyDataSetChanged();
    }
}
