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

public class tuesday extends AppCompatActivity {
    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_tuesday);
        button1=(Button) findViewById(R.id.t1);
        button2=(Button) findViewById(R.id.t2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(tuesday.this,R.anim.fadein);
                button1.startAnimation(animation);
                backactivity();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(tuesday.this,R.anim.fadein);
                button2.startAnimation(animation);
                bicepsactivity();
            }
        });
    }
    public void backactivity(){
        Intent intent1 = new Intent(this, back.class);
        startActivity(intent1);
    }
    public void bicepsactivity(){
        Intent intent2 = new Intent(this, biceps.class);
        startActivity(intent2);
    }

}