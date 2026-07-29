package com.example.program5;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView t1;


    @Override
    protected void onCreate(Bundle savedintstanceState){
        super.onCreate(savedintstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.T);
        String name =getIntent().getStringExtra("username");
        t1.setText("Welcome "+name);

    }
}
