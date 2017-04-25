package com.example.a15056233.demoimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // Declare the ImageView object called ivDay2
    ImageView ivDay2;
    ImageView ivDay3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the ImageView obj and assign to ivDay2

        ivDay2 = (ImageView) findViewById(R.id.imageView2);
        ivDay3 = (ImageView) findViewById(R.id.imageView3);

        // Set the image

        ivDay2.setImageResource(R.drawable.day2);
        ivDay3.setImageResource(R.drawable.day3);

    }
}
