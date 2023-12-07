package com.example.myapppichincha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void usuario (View view){
        Toast.makeText(getApplicationContext(),"Proceso Usuario",Toast.LENGTH_SHORT).show();
    }
    public  void huella (View view){
        Toast.makeText(getApplicationContext(),"Proceso Huella",Toast.LENGTH_SHORT).show();
    }
    public  void pines (View view){
        Toast.makeText(getApplicationContext(),"Proceso Pines",Toast.LENGTH_SHORT).show();
    }

}