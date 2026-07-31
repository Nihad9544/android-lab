package com.example.program6;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    Button sum,sub,mul,div;
    TextView rslt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        n1=(EditText) findViewById(R.id.first);
        n2=(EditText) findViewById(R.id.second);
        sum= findViewById(R.id.sum);
        mul= findViewById(R.id.mul);
        div= findViewById(R.id.div);
        sub= findViewById(R.id.sub);
        rslt= findViewById(R.id.rslt);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double f1= Double.parseDouble(n1.getText().toString());
                Double f2= Double.parseDouble(n2.getText().toString());
                rslt.setText("Addition ="+(f1 + f2));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double f1= Double.parseDouble(n1.getText().toString());
                Double f2= Double.parseDouble(n2.getText().toString());
                rslt.setText("Substraction = "+(f1 - f2));
            }});
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double f1= Double.parseDouble(n1.getText().toString());
                Double f2= Double.parseDouble(n2.getText().toString());
                rslt.setText("Divition = "+(f1 / f2));
            }});
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double f1= Double.parseDouble(n1.getText().toString());
                Double f2= Double.parseDouble(n2.getText().toString());
                rslt.setText("Multiplication = "+(f1 * f2));
            }});
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
