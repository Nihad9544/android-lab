package com.example.record12;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
Spinner spinnerCourse;
TextView textResult;
String[] course={"Select Course","MCA","BCA","BTech","MBA","MTech"};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        spinnerCourse=findViewById(R.id.spinner2);
        textResult=findViewById(R.id.textView4);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, course);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCourse.setAdapter(adapter);
        spinnerCourse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

        @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedCourse=course[position];
                textResult.setText("selected course:"+selectedCourse);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            textResult.setText("no course selected");
            }
        });
    }
}
