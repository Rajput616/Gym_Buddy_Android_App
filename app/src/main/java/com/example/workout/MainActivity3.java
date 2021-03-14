package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    private Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main3);
        button1=(Button) findViewById(R.id.m1);
        button2=(Button) findViewById(R.id.m2);
        button3=(Button) findViewById(R.id.m3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity3.this,R.anim.fadein);
                button1.startAnimation(animation);
                chestactivity();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity3.this,R.anim.fadein);
                button2.startAnimation(animation);
                shoulderactivity();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity3.this,R.anim.fadein);
                button3.startAnimation(animation);
                tricepsactivity();
            }
        });
    }
    public void chestactivity(){
        Intent intent1= new Intent(this,chest.class);
        startActivity(intent1);
    }
    public void shoulderactivity(){
        Intent intent2= new Intent(this,shoulder.class);
        startActivity(intent2);
    }
    public void tricepsactivity(){
        Intent intent3= new Intent(this,triceps.class);
        startActivity(intent3);
    }
}