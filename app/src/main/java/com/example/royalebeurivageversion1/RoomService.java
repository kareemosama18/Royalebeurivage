package com.example.royalebeurivageversion1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RoomService extends BaseActivity {

    private HorizontalScrollView horizontalScrollView1;
    private HorizontalScrollView horizontalScrollView2;
    private ImageView Electimage ;
    private ImageView furnimage ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_service);

        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

        // making menu bar functions
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.Roomservicebtn);
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



        // this will used to change layout according to clicked image

        horizontalScrollView1 = findViewById(R.id.ServiceHorizontalview1);
        horizontalScrollView2 = findViewById(R.id.ServiceHorizontalview2);
        Electimage = findViewById(R.id.Electroincsbtn);
        furnimage = findViewById(R.id.Furniturebtnimage);

        furnimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onChangeButton1Click(view);
            }

        });

        Electimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onChangeButton2Click(view);
            }
        });



    }

    @Override
    protected void onStart(){
        super.onStart();

        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.Roomservicebtn);
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

    public void onPhotoClick(View view) {
        int photoId = view.getId();
        switch (photoId) {
            case R.id.Serviceimage1:
                // Handle click for photo1
                break;
            case R.id.Serviceimage2:
                // Handle click for photo2
                break;
            // Add cases for other photos
        }
    }

    public void onChangeButton1Click(View view) {
        // Toggle visibility for Horizontal Scroll View 1
        horizontalScrollView1.setVisibility(View.VISIBLE);
        horizontalScrollView2.setVisibility(View.GONE);
        onImageClick(view);
    }

    public void onChangeButton2Click(View view) {
        // Toggle visibility for Horizontal Scroll View 2
        horizontalScrollView1.setVisibility(View.GONE);
        horizontalScrollView2.setVisibility(View.VISIBLE);
        onImageClick2(view);
    }



    public void onImageClick(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(
                1f, 1.5f, // Start and end scale values for X-axis
                1f, 1.5f, // Start and end scale values for Y-axis
                Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point X-axis (center)
                Animation.RELATIVE_TO_SELF, 0.5f // Pivot point Y-axis (center)
        );
        scaleAnimation.setDuration(300); // Duration of animation in milliseconds
        scaleAnimation.setFillAfter(true); // Maintain the scale after animation

        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Animation start
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Animation end, you can implement any logic here
                // To return to the original size, you can apply another animation
                ScaleAnimation returnAnimation = new ScaleAnimation(
                        1.5f, 1f, // Start and end scale values for X-axis
                        1.5f, 1f, // Start and end scale values for Y-axis
                        Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point X-axis (center)
                        Animation.RELATIVE_TO_SELF, 0.5f // Pivot point Y-axis (center)
                );
                returnAnimation.setDuration(300);
                returnAnimation.setFillAfter(true);
                furnimage.startAnimation(returnAnimation);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Animation repeat
            }
        });

        furnimage.startAnimation(scaleAnimation);
    }

    public void onImageClick2(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(
                1f, 1.5f, // Start and end scale values for X-axis
                1f, 1.5f, // Start and end scale values for Y-axis
                Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point X-axis (center)
                Animation.RELATIVE_TO_SELF, 0.5f // Pivot point Y-axis (center)
        );
        scaleAnimation.setDuration(300); // Duration of animation in milliseconds
        scaleAnimation.setFillAfter(true); // Maintain the scale after animation

        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Animation start
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Animation end, you can implement any logic here
                // To return to the original size, you can apply another animation
                ScaleAnimation returnAnimation = new ScaleAnimation(
                        1.5f, 1f, // Start and end scale values for X-axis
                        1.5f, 1f, // Start and end scale values for Y-axis
                        Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point X-axis (center)
                        Animation.RELATIVE_TO_SELF, 0.5f // Pivot point Y-axis (center)
                );
                returnAnimation.setDuration(300);
                returnAnimation.setFillAfter(true);
                Electimage.startAnimation(returnAnimation);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Animation repeat
            }
        });

        Electimage.startAnimation(scaleAnimation);
    }
}