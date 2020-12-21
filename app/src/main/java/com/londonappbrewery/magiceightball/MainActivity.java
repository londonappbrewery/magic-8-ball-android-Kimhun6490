package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        Button askButton = (Button) findViewById(R.id.askButton);
        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall); //Use findViewById() to link the ballDisplay with the ball image from layout file.
        //
        final int[] ballArray = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
        //To detect taps on screen = Listener[set on the button]
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create Random
                Random randomNumber = new Random();
                int number = randomNumber.nextInt(5); //0-4
                //
                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}
