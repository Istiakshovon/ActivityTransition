package com.activitytransition;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class ActivityActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);


    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Animatoo.animateSlideLeft(ActivityActivity.this); //fire the slide left animation
    }
}