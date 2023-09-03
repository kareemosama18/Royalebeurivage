package com.example.royalebeurivageversion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Food extends AppCompatActivity {


    //for food category choice buttons

    private ImageView mainfoodimage ;
    private ImageView mainfoodimagegray ;

    private ImageView pizzaimage ;
    private ImageView pizzaimagegray ;

    private ImageView sandwichimage ;
    private ImageView sandwichimagegray ;

    private ImageView dessertimage ;
    private ImageView dessertimagegray ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.Foodbtn);
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
        bottomNavigationView.setSelectedItemId(R.id.Foodbtn);
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



        //food category choice
        initializephotos();


        mainfoodimagegray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainfoodimagegrayClicked(view);
            }
        });
        pizzaimagegray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pizzaimagegrayClicked(view);
            }
        });
        sandwichimagegray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sandwichimagegrayClicked(view);
            }
        });
        dessertimagegray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dessertimagegrayClicked(view);
            }
        });








    }




    public void initializephotos (){

        mainfoodimage = findViewById(R.id.imageviewMain);
        mainfoodimagegray = findViewById(R.id.imageviewMaingray);

        pizzaimage = findViewById(R.id.imageviewpizza);
        pizzaimagegray = findViewById(R.id.imageviewpizzagray);

        sandwichimage = findViewById(R.id.imageviewsandwich);
        sandwichimagegray = findViewById(R.id.imageviewsandwichgray);

        dessertimage = findViewById(R.id.imageviewDessert);
        dessertimagegray = findViewById(R.id.imageviewDessertgray);

    }


    public void mainfoodimagegrayClicked(View view){
        mainfoodimage.setVisibility(view.VISIBLE);
        mainfoodimagegray.setVisibility(view.GONE);

        pizzaimage.setVisibility(view.GONE);
        pizzaimagegray.setVisibility(view.VISIBLE);

        sandwichimage.setVisibility(view.GONE);
        sandwichimagegray.setVisibility(view.VISIBLE);

        dessertimage.setVisibility(view.GONE);
        dessertimagegray.setVisibility(view.VISIBLE);
    }

    public void pizzaimagegrayClicked(View view){
        mainfoodimage.setVisibility(view.GONE);
        mainfoodimagegray.setVisibility(view.VISIBLE);

        pizzaimage.setVisibility(view.VISIBLE);
        pizzaimagegray.setVisibility(view.GONE);

        sandwichimage.setVisibility(view.GONE);
        sandwichimagegray.setVisibility(view.VISIBLE);

        dessertimage.setVisibility(view.GONE);
        dessertimagegray.setVisibility(view.VISIBLE);
    }

    public void sandwichimagegrayClicked(View view){
        mainfoodimage.setVisibility(view.GONE);
        mainfoodimagegray.setVisibility(view.VISIBLE);

        pizzaimage.setVisibility(view.GONE);
        pizzaimagegray.setVisibility(view.VISIBLE);

        sandwichimage.setVisibility(view.VISIBLE);
        sandwichimagegray.setVisibility(view.GONE);

        dessertimage.setVisibility(view.GONE);
        dessertimagegray.setVisibility(view.VISIBLE);
    }

    public void dessertimagegrayClicked(View view){
        mainfoodimage.setVisibility(view.GONE);
        mainfoodimagegray.setVisibility(view.VISIBLE);

        pizzaimage.setVisibility(view.GONE);
        pizzaimagegray.setVisibility(view.VISIBLE);

        sandwichimage.setVisibility(view.GONE);
        sandwichimagegray.setVisibility(view.VISIBLE);

        dessertimage.setVisibility(view.VISIBLE);
        dessertimagegray.setVisibility(view.GONE);
    }



}