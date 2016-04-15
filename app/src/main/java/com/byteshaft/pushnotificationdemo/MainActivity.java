package com.byteshaft.pushnotificationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.parse.Parse;
import com.parse.ParseInstallation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Application");
        Parse.initialize(this, "8Ynqa7RWy4nWhNjLOUUqVOgfqJjppZNubakJXSUq",
                    "yZS7POumij3y5VSIkwuhcKJX5T7ALrGsMPzrjWn3");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
