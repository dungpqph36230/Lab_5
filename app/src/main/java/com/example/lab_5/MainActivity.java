package com.example.lab_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spSinhVien = findViewById(R.id.spinner_Nv);
        ArrayList<sinhVien_model> list = new ArrayList<>();
        list.add(new sinhVien_model(R.drawable.pl_hn, "Hà Nội"));
        list.add(new sinhVien_model(R.drawable.pl_dn, "Đà Nẵng"));
        list.add(new sinhVien_model(R.drawable.pl_hp, "Hải Phòng"));
        list.add(new sinhVien_model(R.drawable.pl_tn, "Tây Nguyên"));
        list.add(new sinhVien_model(R.drawable.pl_hcm, "Hồ Chí Minh"));
        sinhVien_Adapter sinhVienAdapter = new sinhVien_Adapter(this ,list);
        spSinhVien.setAdapter(sinhVienAdapter);
    }
}