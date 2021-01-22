package com.activitytransition;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16;

    private AnimationDrawable animationDrawable;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        // init constraintLayout
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

        // initializing animation drawable by getting background from constraint layout
        animationDrawable = (AnimationDrawable) linearLayout.getBackground();

        // setting enter fade animation duration to 5 seconds
        animationDrawable.setEnterFadeDuration(5000);

        // setting exit fade animation duration to 2 seconds
        animationDrawable.setExitFadeDuration(2000);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn10 = findViewById(R.id.button10);
        btn11 = findViewById(R.id.button11);
        btn12 = findViewById(R.id.button12);
        btn13 = findViewById(R.id.button13);
        btn14 = findViewById(R.id.button14);
        btn15 = findViewById(R.id.button15);
        btn16 = findViewById(R.id.button16);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityActivity.class);
                startActivity(intent);
                Animatoo.animateSlideLeft(MainActivity.this); //fire the slide left animation
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityActivity.class);
                startActivity(intent);
                Animatoo.animateInAndOut(MainActivity.this); //fire the slide left animation
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityActivity.class);
                startActivity(intent);
                Animatoo.animateSlideRight(MainActivity.this); //fire the slide left animation
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityActivity.class);
                startActivity(intent);
                Animatoo.animateSplit(MainActivity.this); //fire the slide left animation
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityActivity.class);
                startActivity(intent);
                Animatoo.animateShrink(MainActivity.this); //fire the slide left animation
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityActivity.class);
                startActivity(intent);
                Animatoo.animateCard(MainActivity.this); //fire the slide left animation
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityActivity.class);
                startActivity(intent);
                Animatoo.animateZoom(MainActivity.this); //fire the slide left animation
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityActivity.class);
                startActivity(intent);
                Animatoo.animateFade(MainActivity.this); //fire the slide left animation
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityActivity.class);
                startActivity(intent);
                Animatoo.animateSpin(MainActivity.this); //fire the slide left animation
            }
        });


        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityActivity.class);
                startActivity(intent);
                Animatoo.animateDiagonal(MainActivity.this); //fire the slide left animation
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityActivity.class);
                startActivity(intent);
                Animatoo.animateWindmill(MainActivity.this); //fire the slide left animation
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityActivity.class);
                startActivity(intent);
                Animatoo.animateSlideUp(MainActivity.this); //fire the slide left animation
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityActivity.class);
                startActivity(intent);
                Animatoo.animateSlideDown(MainActivity.this); //fire the slide left animation
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityActivity.class);
                startActivity(intent);
                Animatoo.animateSlideLeft(MainActivity.this); //fire the slide left animation
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityActivity.class);
                startActivity(intent);
                Animatoo.animateSlideRight(MainActivity.this); //fire the slide left animation
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityActivity.class);
                startActivity(intent);
                Animatoo.animateSlideLeft(MainActivity.this); //fire the slide left animation
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (animationDrawable != null && !animationDrawable.isRunning()) {
            // start the animation
            animationDrawable.start();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (animationDrawable != null && animationDrawable.isRunning()) {
            // stop the animation
            animationDrawable.stop();
        }
    }
}