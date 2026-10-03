package com.example.record11;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
 GridView gridView;
 int[] images = {
         R.drawable.apple,
         R.drawable.banana,
         R.drawable.orange,
 };
 String[] names = {
         "Apple",
         "Banana",
         "Orange",
 };


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       gridView = findViewById(R.id.gridview);
       gridView.setAdapter(new BaseAdapter() {
           @Override
           public int getCount() {
               return images.length;
           }

           @Override
           public Object getItem(int position) {
               return images[position];
           }

           @Override
           public long getItemId(int position) {
               return position;
           }

           @Override
           public View getView(int position, View convertview, ViewGroup parent) {
               ImageView imageView = new ImageView(MainActivity.this);
               imageView.setImageResource(images[position]);
               imageView.setLayoutParams(
                       new ViewGroup.LayoutParams(300,300)
               );
               imageView.setScaleType(
                       ImageView.ScaleType.CENTER_CROP
               );
               return imageView;
           }
       });
           gridView.setOnItemClickListener(
                   new AdapterView.OnItemClickListener(){
                   @Override
                   public void onItemClick(AdapterView<?> parent,
                                           View view,
                                           int position,
                                           long id)   {
                       new AlertDialog.Builder(MainActivity.this)
                               .setTitle("Selected Image")
                               .setTitle("you selectd" + names[position])
                               .setPositiveButton("OK",null)
                               .show();

                   }

    });
    }
}
