package com.example.program7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
 ImageView img1,img2;
 Button btnToggle;
 boolean  isFiestImage=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
         img1=findViewById(R.id.imageView);
         img2=findViewById(R.id.imageView7);
        btnToggle=findViewById(R.id.toggleButton);
        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFiestImage){
                    img1.setVisibility(View.GONE);
                    img2.setVisibility(View.VISIBLE);
                }else{
                    img1.setVisibility(View.VISIBLE);
                    img2.setVisibility(View.GONE);
                }
                isFiestImage=!isFiestImage;
            }
        });


    }
}
