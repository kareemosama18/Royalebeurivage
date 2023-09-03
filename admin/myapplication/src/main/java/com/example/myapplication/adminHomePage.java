package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class adminHomePage extends AppCompatActivity {

    private ImageView userimageview;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home_page);



        userimageview = findViewById(R.id.imageViewUser) ;
        userimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(adminHomePage.this, userpage.class); // Replace with the target activity class
                startActivity(intent);

            }
        });



    }




}