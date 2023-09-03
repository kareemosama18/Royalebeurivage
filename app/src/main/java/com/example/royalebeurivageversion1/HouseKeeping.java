package com.example.royalebeurivageversion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HouseKeeping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_keeping);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.Housekeepingbtn);
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

                case R.id.Housekeepingbtn :
                    startActivity(new Intent(this, HouseKeeping.class));
                    return true;

                // Add more cases for other buttons if needed
                default:
                    return false;
            }
        });

        bottomNavigationView.setOnNavigationItemReselectedListener(item -> {
            // Do nothing when the selected item is reselected
            // This prevents the same activity from being recreated
        });
    }


    @Override
    protected void onStart(){
        super.onStart();

        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.Housekeepingbtn);
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

                case R.id.Housekeepingbtn :
                    startActivity(new Intent(this, HouseKeeping.class));
                    return true;

                // Add more cases for other buttons if needed
                default:
                    return false;
            }
        });

        bottomNavigationView.setOnNavigationItemReselectedListener(item -> {
            // Do nothing when the selected item is reselected
            // This prevents the same activity from being recreated
        });


    }
}