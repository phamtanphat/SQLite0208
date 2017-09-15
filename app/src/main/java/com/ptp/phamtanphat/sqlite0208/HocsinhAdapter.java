package com.ptp.phamtanphat.sqlite0208;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by KhoaPhamPC on 15/9/2017.
 */

public class HocsinhAdapter extends BaseAdapter {
    Context context;
    ArrayList<Hocsinh> hocsinhArrayList;

    public HocsinhAdapter(Context context, ArrayList<Hocsinh> hocsinhArrayList) {
        this.context = context;
        this.hocsinhArrayList = hocsinhArrayList;
    }

    @Override
    public int getCount() {
        return hocsinhArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return hocsinhArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    class ViewHolder{
        TextView txtten,txtnamsinh,txtdiadiem;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            view = layoutInflater.inflate(R.layout.dong_listview,null);
            viewHolder = new ViewHolder();
            viewHolder.txtten = view.findViewById(R.id.textviewten);
            viewHolder.txtdiadiem = view.findViewById(R.id.textviewdiadiem);
            viewHolder.txtnamsinh = view.findViewById(R.id.textviewnamsinh);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }
        Hocsinh hocsinh = (Hocsinh) getItem(i);
        viewHolder.txtten.setText("Ten : " + hocsinh.getTen());
        viewHolder.txtnamsinh.setText("Ngay sinh : " + hocsinh.getNamsinh());
        viewHolder.txtdiadiem.setText("Cu tru : " + hocsinh.getDiadiem());
        return view;
    }
}
