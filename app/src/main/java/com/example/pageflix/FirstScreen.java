package com.example.pageflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
    }
//Here we move to Customer screen
    public void CustomerLoginButtom(View v){
            Intent intent = new Intent(this, LoginCustomer.class);// from first screen to LoginCustomer screen
            startActivity(intent);
    }
    //Here we move to Librarian screen
    public void CustomerLibrarianButtom(View v){
        Intent intent = new Intent(this, LoginLibrarian.class);// from first screen to Login Librarian screen
        startActivity(intent);
    }
}