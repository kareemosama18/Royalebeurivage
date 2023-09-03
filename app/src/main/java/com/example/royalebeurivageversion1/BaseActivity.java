package com.example.royalebeurivageversion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.Homepagebtn:
                    startActivity(new Intent(this, HomepageMainActivity.class));
                    return true;
                case R.id.Foodbtn:
                    startActivity(new Intent(this, Food.class));
                    return true;

                case R.id.Roomservicebtn:
                    startActivity(new Intent(this, RoomService.class));
                    return true;
                // Add more cases for other buttons if needed
                default:
                    return false;
            }
        });
    }
}