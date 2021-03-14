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

public class MainActivity2 extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6,button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);
        button1= (Button) findViewById(R.id.Bt1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity2.this,R.anim.fadein);
                button1.startAnimation(animation);
                openact1();
            }
        });
        button2= (Button) findViewById(R.id.Bt2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity2.this,R.anim.fadein);
                button2.startAnimation(animation);
                openact2();
            }
        });
        button3= (Button) findViewById(R.id.Bt3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity2.this,R.anim.fadein);
                button3.startAnimation(animation);
                openact3();
            }
        });
        button4= (Button) findViewById(R.id.Bt4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity2.this,R.anim.fadein);
                button4.startAnimation(animation);
                openact4();
            }
        });
        button5= (Button) findViewById(R.id.Bt5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity2.this,R.anim.fadein);
                button5.startAnimation(animation);
                openact5();
            }
        });
        button6= (Button) findViewById(R.id.Bt6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity2.this,R.anim.fadein);
                button6.startAnimation(animation);
                openact6();
            }
        });
        button7= (Button) findViewById(R.id.Bt7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity2.this,R.anim.fadein);
                button7.startAnimation(animation);
                openact7();
            }
        });


    }
    public void openact1(){
        Intent intent1 = new Intent(this, MainActivity3.class);
        startActivity(intent1);
    }
    public void openact2(){
        Intent intent2 = new Intent(this, tuesday.class);
        startActivity(intent2);
    }
    public void openact3(){
        Intent intent3 = new Intent(this, wednesday.class);
        startActivity(intent3);
    }
    public void openact4(){
        Intent intent4 = new Intent(this, MainActivity3.class);
        startActivity(intent4);
    }
    public void openact5(){
        Intent intent5 = new Intent(this, tuesday.class);
        startActivity(intent5);
    }
    public void openact6(){
        Intent intent6 = new Intent(this, wednesday.class);
        startActivity(intent6);
    }
    public void openact7(){
        Intent intent7 = new Intent(this, sunday.class);
        startActivity(intent7);
    }
}