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
    private ImageView useraddimageview ;
    private ImageView usereditimageview ;

    private Button addUserbtn ;
    private Button editUserbtn ;
    private Button deleteUserbtn ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home_page);

        addUserbtn = findViewById(R.id.buttonAddUser) ;
        editUserbtn = findViewById(R.id.buttonEditUser);
        deleteUserbtn = findViewById(R.id.buttonDeleteUser);
        useraddimageview = findViewById(R.id.imageViewuseradd);
        usereditimageview = findViewById(R.id.imageViewEditUser);

        userimageview = findViewById(R.id.imageViewUser) ;
        userimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent userintent = new Intent(adminHomePage.this, userpage.class); // Replace with the target activity class
                startActivity(userintent);
            }
        });

        useraddimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                useraddimageviewClicked();
            }
        });
        usereditimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usereditimageviewClicked();
            }
        });



    }


    public void useraddimageviewClicked(){

        addUserbtn.setVisibility(View.VISIBLE);
        editUserbtn.setVisibility(View.GONE);
        deleteUserbtn.setVisibility(View.GONE);

    }

    public void usereditimageviewClicked(){

        addUserbtn.setVisibility(View.GONE);
        editUserbtn.setVisibility(View.VISIBLE);
        deleteUserbtn.setVisibility(View.VISIBLE);

    }
}