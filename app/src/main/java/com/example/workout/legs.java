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

public class legs extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_legs);
        getSupportActionBar().setTitle("Legs");
        button1=(Button) findViewById(R.id.l1);
        button2=(Button) findViewById(R.id.l2);
        button3=(Button) findViewById(R.id.l3);
        button4=(Button) findViewById(R.id.l4);
        button5=(Button) findViewById(R.id.l5);
        button6=(Button) findViewById(R.id.l6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lex1();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lex2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lex3();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lex4();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lex5();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lex6();
            }
        });

    }
    public void lex1(){
        Intent intent1 = new Intent(this, legs_1.class);
        startActivity(intent1);

    }
    public void lex2(){
        Intent intent2 = new Intent(this, legs_2.class);
        startActivity(intent2);

    }
    public void lex3(){
        Intent intent3 = new Intent(this, legs_3.class);
        startActivity(intent3);

    }
    public void lex4(){
        Intent intent4 = new Intent(this, legs_4.class);
        startActivity(intent4);

    }
    public void lex5(){
        Intent intent5 = new Intent(this, legs_5.class);
        startActivity(intent5);

    }
    public void lex6(){
        Intent intent6 = new Intent(this, legs_6.class);
        startActivity(intent6);

    }
}
