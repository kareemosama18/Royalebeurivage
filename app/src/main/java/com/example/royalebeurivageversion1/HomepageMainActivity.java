package com.example.royalebeurivageversion1;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomepageMainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage_main);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

        //Making Order image clickable

        ImageView Orderimage = findViewById(R.id.imageView2);
        Orderimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewOrdersLayout() ;
            }
        });

        // making menu bar functions
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.Homepagebtn);
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
        bottomNavigationView.setSelectedItemId(R.id.Homepagebtn);
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

    private void ViewOrdersLayout(){
        //inflate layout

        LayoutInflater inflater = getLayoutInflater() ;
        View dialog = inflater.inflate(R.layout.homepage_popup_layout , null ) ;

        // show the layout
        Dialog dialog1 = new Dialog(this);
        dialog1.setContentView(dialog);
        dialog1.show();

    }
}