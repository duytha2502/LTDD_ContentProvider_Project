package com.example.ltdd_contenprovider_project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        addEvents();
    }
    private void xuLyMoHinhDanhBa(){
        Intent intent = new Intent(MainActivity.this,DanhBa.class);
        intent.setClassName("com.example.ltdd_contenprovider_project","com.example.ltdd_contenprovider_project.DanhBa");
        startActivity(intent);
    }

    private void addEvents(){
        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                xuLyMoHinhDanhBa();
            }
        });
    }


    private void addControl(){

        btn1 = findViewById(R.id.btn1);
    }

        }
