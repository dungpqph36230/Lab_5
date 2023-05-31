package com.example.lab_5;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DangKy extends AppCompatActivity {
    public static String Key_user ="user";
    public static String Key_pass ="Pass";

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai4_dangky);
        EditText tk = findViewById(R.id.edt_username);
        EditText mk = findViewById(R.id.edt_passwork);
        EditText rmk = findViewById(R.id.edt_comfirm);
        Button btn = findViewById(R.id.btn_dky);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = tk.getText().toString();
                String pas =mk.getText().toString();
                String repas = rmk.getText().toString();
                if(user==null || user.equals("")){
                    Toast.makeText(DangKy.this, "Chua nhap tai khoan", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(pas == null || pas.equals("")){
                    Toast.makeText(DangKy.this, "Chua nhap mat khau", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(repas == null || repas.equals("")){
                    Toast.makeText(DangKy.this, "Chua nhap lai mat khau", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!pas.equals(repas)){
                    Toast.makeText(DangKy.this, "Mat Khau khong khop", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(getApplicationContext(), DangNhap.class);
                intent.putExtra(Key_user,user);
                intent.putExtra(Key_pass,pas);
                startActivity(intent);
            }
        });
    }
}