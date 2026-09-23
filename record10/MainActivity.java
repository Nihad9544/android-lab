package com.example.record10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
    }
    public void Click(View view){
        Intent i=new Intent(this, MainActivity2.class);
        i.putExtra("name","nihad");
        i.putExtra("age","21");
        i.putExtra("place","");
        i.putExtra("college","KMCT");


        startActivity(i);
    }
}
