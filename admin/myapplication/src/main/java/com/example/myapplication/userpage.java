package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class userpage extends AppCompatActivity {

    private ImageView useraddimageview ;
    private ImageView usereditimageview ;

    private Button addUserbtn ;
    private Button editUserbtn ;
    private Button deleteUserbtn ;

    private EditText editTextGname ;
    private EditText editTextGusername ;
    private EditText editTextGpassword ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userpage);

        addUserbtn = findViewById(R.id.buttonAddUser);
        editUserbtn = findViewById(R.id.buttonEditUser);
        deleteUserbtn = findViewById(R.id.buttonDeleteUser);
        useraddimageview = findViewById(R.id.imageViewuseradd);
        usereditimageview = findViewById(R.id.imageViewEditUser);
        editTextGname = findViewById(R.id.editTextTextGuestName);
        editTextGusername = findViewById(R.id.editTextTextGuestUserName) ;
        editTextGpassword = findViewById(R.id.editTextTextGuestPassword) ;


        addUserbtn.setVisibility(View.VISIBLE);
        editUserbtn.setVisibility(View.GONE);
        deleteUserbtn.setVisibility(View.GONE);
        useraddimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                useraddimageviewclicked();
            }
        });

        usereditimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usereditimageviewclicked();
            }
        });

        addUserbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addUserbtnclickd();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        addUserbtn.setVisibility(View.VISIBLE);
        editUserbtn.setVisibility(View.GONE);
        deleteUserbtn.setVisibility(View.GONE);
        useraddimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                useraddimageviewclicked();
            }
        });

        usereditimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usereditimageviewclicked();
            }
        });

    }

    public void useraddimageviewclicked(){
        addUserbtn.setVisibility(View.VISIBLE);
        editUserbtn.setVisibility(View.GONE);
        deleteUserbtn.setVisibility(View.GONE);
    }

    public void usereditimageviewclicked(){
        addUserbtn.setVisibility(View.GONE);
        editUserbtn.setVisibility(View.VISIBLE);
        deleteUserbtn.setVisibility(View.VISIBLE);
    }

    public void addUserbtnclickd(){
        String name = editTextGname.getText().toString().trim();
        String usernametxt = editTextGusername.getText().toString().trim();
        String passwordtxt = editTextGpassword.getText().toString().trim();

        if (passwordtxt.isEmpty()) {
            // The EditText is empty, show an error message or take appropriate action.
            editTextGpassword.setError("Guest password is required"); // Display an error message.
            editTextGpassword.requestFocus(); // Set focus to the EditText.
        } else {
            // The EditText is not empty, proceed with your logic.
            // For example, you can save the data or perform other actions.
        }



        if (usernametxt.isEmpty()) {
            // The EditText is empty, show an error message or take appropriate action.
            editTextGusername.setError("Guest username is required"); // Display an error message.
            editTextGusername.requestFocus(); // Set focus to the EditText.
        } else {
            // The EditText is not empty, proceed with your logic.
            // For example, you can save the data or perform other actions.
        }

        if (name.isEmpty()) {
            // The EditText is empty, show an error message or take appropriate action.
            editTextGname.setError("Guest name is required"); // Display an error message.
            editTextGname.requestFocus(); // Set focus to the EditText.
        } else {
            // The EditText is not empty, proceed with your logic.
            // For example, you can save the data or perform other actions.
        }



    }
}