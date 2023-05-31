package com.example.lab_5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class DangNhap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai4_dangnhap);
        EditText tk = findViewById(R.id.edt_name);
        EditText mk = findViewById(R.id.edt_pass);
        Button btn_dk = findViewById(R.id.btn_dangky);
        Button btn_dn = findViewById(R.id.btn_dangnhap);
        btn_dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DangKy.class);
                startActivity(intent);
            }
        });
        String user = getIntent().getStringExtra(DangKy.Key_user);
        String pass = getIntent().getStringExtra(DangKy.Key_pass);
        tk.setText(user);
        mk.setText(pass);
        btn_dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), listDanhSachSv.class);
                startActivity(intent);
            }
        });
    }
}