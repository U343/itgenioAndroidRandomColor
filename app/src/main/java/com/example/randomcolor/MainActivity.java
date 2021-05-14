package com.example.randomcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = findViewById(R.id.my_image_view);
        mButton = findViewById(R.id.my_button);

        addButtonOnClickListener();
    }

    private void addButtonOnClickListener() {
        mButton.setOnClickListener(v -> {
            int color = generateRandomColor();
            mImageView.setBackgroundColor(color);
        });
    }

    private int generateRandomColor() {
        Random randomGenerator = new Random();
        int red = randomGenerator.nextInt(255);
        int green = randomGenerator.nextInt(255);
        int blue = randomGenerator.nextInt(255);

        return Color.rgb(red, green, blue);
    }
}