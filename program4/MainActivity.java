package com.example.program4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText etName,etEmail,etPassword;
RadioGroup rgGender;
Spinner spCountry;
CheckBox chkTerms;
Button btnSubmit;
String[]country={"Select Country","India","USA","UK","Canada"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        etName=findViewById(R.id.etName);
        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
        rgGender=findViewById(R.id.rgGender);
        spCountry=findViewById(R.id.spCountry);
        chkTerms=findViewById(R.id.chkTerms);
        btnSubmit=findViewById(R.id.btnsubmit);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,country
        );
        spCountry.setAdapter(adapter);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
            String name=etName.getText().toString().trim();
            String email=etEmail.getText().toString().trim();
            String password=etPassword.getText().toString().trim();
            if(name.isEmpty()){
                etName.setError("Enter Name");
                return;
            }
            if(email.isEmpty()){
            etEmail.setError("Enter Email");
            return;
            }
             if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                etEmail.setError("Invalid Email");
                return;
            }
              if(password.length()<8){
                etPassword.setError("password must be at least 8 characters");
                return;
            }
                 if(rgGender.getCheckedRadioButtonId()==-1){
                Toast.makeText(MainActivity.this,
                        "Select Gender",
                        Toast.LENGTH_SHORT).show();
                return;
            }
                      if(spCountry.getSelectedItemPosition()==0){
                Toast.makeText(MainActivity.this,
                        "Select Country",
                        Toast.LENGTH_SHORT).show();
                return;
            }
                 if(!chkTerms.isChecked()){
                     Toast.makeText(MainActivity.this,
                             "Accept Terms and Conditions",
                             Toast.LENGTH_SHORT).show();
                return;
            }
                 Toast.makeText(MainActivity.this,
                    "Validation Successful",
                       Toast.LENGTH_SHORT).show();



            }
        });


    }
}
