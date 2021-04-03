package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.Math.round;

public class Game2 extends AppCompatActivity {
    ImageView user,target1,target2,target3,target4,target5,target6,canvas;
    TextView i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        user=(ImageView)findViewById(R.id.user);
        target1=(ImageView)findViewById(R.id.target1);
        target2=(ImageView)findViewById(R.id.target2);
        target3=(ImageView)findViewById(R.id.target3);
        target4=(ImageView)findViewById(R.id.target4);
        target5=(ImageView)findViewById(R.id.target5);
        target6=(ImageView)findViewById(R.id.target6);
        canvas=(ImageView)findViewById(R.id.canvas) ;
        i=(TextView)findViewById(R.id.i);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        final int height = displayMetrics.heightPixels;
        final int width = displayMetrics.widthPixels;
        final int tx=(round(width/2+width/4)/100)*100;
        final int ty=(round(height/2+height/4)/100)*100;
        target1.setTranslationX(0);
        target2.setTranslationX(tx/4);
        target3.setTranslationX(tx/2);
        target4.setTranslationX(tx/4+tx/2);
        target5.setTranslationX(tx);
        target6.setTranslationX(tx+target5.getWidth());
        canvas.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float x=motionEvent.getX();
                float y=motionEvent.getY();
                float targetx1=target1.getTranslationX();
                float targety1=target1.getTranslationY();
                float targetx2=target2.getTranslationX();
                float targety2=target2.getTranslationY();
                float targetx3=target3.getTranslationX();
                float targety3=target3.getTranslationY();
                float targetx4=target4.getTranslationX();
                float targety4=target4.getTranslationY();
                float targetx5=target5.getTranslationX();
                float targety5=target5.getTranslationY();
                float targetx6=target6.getTranslationX();
                float targety6=target6.getTranslationY();
                if(x>=0)
                {
                    user.setTranslationX(x);
                }
                if(y>=0)
                {
                    user.setTranslationY(y);
                }
                if((round(x)>round(targetx1)-25 && round(x)<round(targetx1)+25 && round(y)>round(targety1)-25 && round(y)<round(targety1)+25)
                || (round(x)>round(targetx2)-25 && round(x)<round(targetx2)+25 && round(y)>round(targety2)-25 && round(y)<round(targety2)+25)
                || (round(x)>round(targetx3)-25 && round(x)<round(targetx3)+25 && round(y)>round(targety3)-25 && round(y)<round(targety3)+25)
                || (round(x)>round(targetx4)-25 && round(x)<round(targetx4)+25 && round(y)>round(targety4)-25 && round(y)<round(targety4)+25)
                || (round(x)>round(targetx5)-25 && round(x)<round(targetx5)+25 && round(y)>round(targety5)-25 && round(y)<round(targety5)+25)
                || (round(x)>round(targetx6)-25 && round(x)<round(targetx6)+25 && round(y)>round(targety6)-25 && round(y)<round(targety6)+25))
                    i.setText("Lost");
                return  true;
            }
        });
        try
        {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while(true)
                    {
                        try {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    int d=2000;
                                    float targety1=parseFloat(""+Math.random() * ty);
                                    float targety2=parseFloat(""+Math.random() * ty);
                                    float targety3=parseFloat(""+Math.random() * ty);
                                    float targety4=parseFloat(""+Math.random() * ty);
                                    float targety5=parseFloat(""+Math.random() * ty);
                                    float targety6=parseFloat(""+Math.random() * ty);
                                    ObjectAnimator transAnimation1= ObjectAnimator.ofFloat(target1, "translationY", target1.getTranslationY(), targety1);
                                    transAnimation1.setDuration(d);//set duration
                                    transAnimation1.start();
                                    ObjectAnimator transAnimation2= ObjectAnimator.ofFloat(target2, "translationY", target2.getTranslationY(), targety2);
                                    transAnimation2.setDuration(d);//set duration
                                    transAnimation2.start();
                                    ObjectAnimator transAnimation3= ObjectAnimator.ofFloat(target3, "translationY", target3.getTranslationY(), targety3);
                                    transAnimation3.setDuration(d);//set duration
                                    transAnimation3.start();
                                    ObjectAnimator transAnimation4= ObjectAnimator.ofFloat(target4, "translationY", target4.getTranslationY(), targety4);
                                    transAnimation4.setDuration(d);//set duration
                                    transAnimation4.start();
                                    ObjectAnimator transAnimation5= ObjectAnimator.ofFloat(target5, "translationY", target5.getTranslationY(), targety5);
                                    transAnimation5.setDuration(d);//set duration
                                    transAnimation5.start();
                                    ObjectAnimator transAnimation6= ObjectAnimator.ofFloat(target6, "translationY", target6.getTranslationY(), targety6);
                                    transAnimation6.setDuration(d);//set duration
                                    transAnimation6.start();
                                    float x=user.getTranslationX();
                                    float y=user.getTranslationY();
                                    float targetx1=target1.getTranslationX();
                                    targety1=target1.getTranslationY();
                                    float targetx2=target2.getTranslationX();
                                    targety2=target2.getTranslationY();
                                    float targetx3=target3.getTranslationX();
                                    targety3=target3.getTranslationY();
                                    float targetx4=target4.getTranslationX();
                                    targety4=target4.getTranslationY();
                                    float targetx5=target5.getTranslationX();
                                    targety5=target5.getTranslationY();
                                    float targetx6=target6.getTranslationX();
                                    targety6=target6.getTranslationY();
                                    if((round(x)>round(targetx1)-25 && round(x)<round(targetx1)+25 && round(y)>round(targety1)-25 && round(y)<round(targety1)+25)
                                            || (round(x)>round(targetx2)-25 && round(x)<round(targetx2)+25 && round(y)>round(targety2)-25 && round(y)<round(targety2)+25)
                                            || (round(x)>round(targetx3)-25 && round(x)<round(targetx3)+25 && round(y)>round(targety3)-25 && round(y)<round(targety3)+25)
                                            || (round(x)>round(targetx4)-25 && round(x)<round(targetx4)+25 && round(y)>round(targety4)-25 && round(y)<round(targety4)+25)
                                            || (round(x)>round(targetx5)-25 && round(x)<round(targetx5)+25 && round(y)>round(targety5)-25 && round(y)<round(targety5)+25)
                                            || (round(x)>round(targetx6)-25 && round(x)<round(targetx6)+25 && round(y)>round(targety6)-25 && round(y)<round(targety6)+25))
                                        i.setText("Lost");
                                }
                            });
                            Thread.sleep(2000);
                        }
                        catch (Exception e)
                        {

                        }
                    }
                }
            }).start();
        }
        catch (Exception e)
        {

        }
        try {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while(true)
                    {
                        int min,sec;
                        TextView t=(TextView)findViewById(R.id.clock);
                        String text=t.getText().toString();
                        String[] list=text.split(":");
                        min=parseInt(list[0]);
                        sec=parseInt(list[1]);
                        sec=sec+1;
                        if(sec>60)
                            min=min+1;
                        t.setText(min+":"+sec);
                    }
                }
            });
            Thread.sleep(1000);
        }
        catch (Exception e)
        {

        }

    }
}