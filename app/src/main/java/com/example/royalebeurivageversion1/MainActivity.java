package com.example.royalebeurivageversion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button signinbtn = findViewById(R.id.buttonSignIn);
        signinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , HomepageMainActivity.class);
                startActivity(intent);
            }
        });
    }

    //Change username edit text font

   // EditText editTextUsername = findViewById(R.id.editTextUserName) ;
    //Typeface customFont = Typeface.createFromAsset(getAssets() , "futura light bt.ttf") ;

    //Change button color


}