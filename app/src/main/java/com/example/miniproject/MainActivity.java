package com.example.miniproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.learn);
        b2=(Button)findViewById(R.id.quiz);
        b3=(Button)findViewById(R.id.game);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(MainActivity.this,Learn.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=new Intent(MainActivity.this,Quiz.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Game2.class);
                final AlertDialog.Builder alert1=new AlertDialog.Builder(MainActivity.this);
                alert1.setTitle("NOTE");
                alert1.setMessage("Try to avoid the green balls to survive");
                alert1.setCancelable(true);
                alert1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(intent);
                    }
                });
                alert1.setNegativeButton("", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(intent);
                    }
                });
                AlertDialog dialog1=alert1.create();
                dialog1.show();
            }
        });

    }
}