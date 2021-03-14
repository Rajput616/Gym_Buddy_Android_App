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

public class wednesday extends AppCompatActivity {
    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_wednesday);
        button1= (Button) findViewById(R.id.w1);
        button2= (Button) findViewById(R.id.w2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(wednesday.this,R.anim.fadein);
                button1.startAnimation(animation);
                legactivity();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(wednesday.this,R.anim.fadein);
                button2.startAnimation(animation);
                absactivity();
            }
        });
    }
    public void legactivity(){
        Intent intent1 = new Intent(this, legs.class);
        startActivity(intent1);
    }
    public void absactivity(){
        Intent intent2 = new Intent(this, abs.class);
        startActivity(intent2);
    }
}