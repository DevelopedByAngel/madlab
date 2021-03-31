package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static java.lang.Float.parseFloat;
import static java.lang.Math.round;

public class Game2 extends AppCompatActivity {
    ImageView user,target,canvas;
    TextView i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        user=(ImageView)findViewById(R.id.user);
        target=(ImageView)findViewById(R.id.target);
        canvas=(ImageView)findViewById(R.id.canvas) ;
        i=(TextView)findViewById(R.id.i);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        final int height = displayMetrics.heightPixels;
        final int width = displayMetrics.widthPixels;
        final int tx=(round(width/2+width/4)/100)*100;
        final int ty=(round(height/2+height/4)/100)*100;
            target.setTranslationX(parseFloat(""+Math.random() * tx));
            target.setTranslationY(parseFloat(""+Math.random() * ty));
        canvas.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float x=motionEvent.getX();
                float y=motionEvent.getY();
                if(x>=0)
                {
                    user.setTranslationX(motionEvent.getX());
                }
                if(y>=0)
                {
                    user.setTranslationY(motionEvent.getY());
                }
//                Boolean a=pass(x,y);
                i.setText(user.getTranslationX()+"_"+user.getTranslationY()+"_"+(round(x/100))*100);
                return  true;
            }
        });
    }
}