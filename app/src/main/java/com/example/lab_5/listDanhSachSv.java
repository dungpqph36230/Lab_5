package com.example.lab_5;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class listDanhSachSv extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_danhsach);
        ListView lvdanhSach = findViewById(R.id.lv_danhsach);
        ArrayList<danhSachModel> list = new ArrayList<>();
        list.add(new danhSachModel("Phùng Quang Dũng", "Hà Nội", "FPoly Hà Nội"));
        list.add(new danhSachModel("Đinh Hoài Nam", "Thái Bình", "FPoly Hải Dương"));
        list.add(new danhSachModel("Tống Doanh Chính", "Nam Định", "FPoly Hà Nội"));
        list.add(new danhSachModel("Lê Mạnh Quỳnh", "Vĩnh Phúc", "FPoly Đà Nẵng"));
        list.add(new danhSachModel("Phạm Tiến Minh", "Vĩnh Phúc", "FPoly Hải Phòng"));

        AdapterdanhSach adapterdanhSach = new AdapterdanhSach(this, list);
        lvdanhSach.setAdapter(adapterdanhSach);
    }

    private class AdapterdanhSach extends BaseAdapter {
        Context ctx;
        ArrayList<danhSachModel> list;

        public AdapterdanhSach(Context ctx, ArrayList<danhSachModel> list) {
            this.ctx = ctx;
            this.list = list;
        }


        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = ((Activity) ctx).getLayoutInflater();
            convertView = inflater.inflate(R.layout.itemsinhvien, parent, false);
            TextView ten = convertView.findViewById(R.id.txt_ten);
            TextView diaChi = convertView.findViewById(R.id.txt_noiO);
            TextView logo = convertView.findViewById(R.id.txt_logo);

            danhSachModel model = list.get(position);
            ten.setText(model.getTen());
            diaChi.setText(model.getDiaChi());
            logo.setText(model.getLogo());

            return convertView;
        }
    }
}
