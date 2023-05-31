package com.example.lab_5;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class sinhVien_Adapter  extends BaseAdapter {
    private final Context ctx;
    private final ArrayList<sinhVien_model> list;

    public sinhVien_Adapter(Context ctx, ArrayList<sinhVien_model> list) {
        this.ctx = ctx;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = ((Activity) ctx).getLayoutInflater();
        view = inflater.inflate(R.layout.itemsinhvien, viewGroup,false);
        ImageView anh = view.findViewById(R.id.imageanh1);
        TextView chu = view.findViewById(R.id.text1);

        sinhVien_model sinhVienModel = list.get(i);
        anh.setImageResource(list.get(i).getImmage());
        chu.setText("FPoly"+list.get(i).getTen());
        return view;
    }
}
