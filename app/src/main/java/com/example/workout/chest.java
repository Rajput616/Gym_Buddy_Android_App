package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class chest extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_chest);
        getSupportActionBar().setTitle("Chest");
        button1=(Button) findViewById(R.id.ch1);
        button2=(Button) findViewById(R.id.ch2);
        button3=(Button) findViewById(R.id.ch3);
        button4=(Button) findViewById(R.id.ch4);
        button5=(Button) findViewById(R.id.ch5);
        button6=(Button) findViewById(R.id.ch6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chex1();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chex2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chex3();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chex4();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chex5();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chex6();
            }
        });

    }
    public void chex1(){
        Intent intent1 = new Intent(this, chest_1.class);
        startActivity(intent1);

    }
    public void chex2(){
        Intent intent2 = new Intent(this, chest_2.class);
        startActivity(intent2);

    }
    public void chex3(){
        Intent intent3 = new Intent(this, chest_3.class);
        startActivity(intent3);

    }
    public void chex4(){
        Intent intent4 = new Intent(this, chest_4.class);
        startActivity(intent4);

    }
    public void chex5(){
        Intent intent5 = new Intent(this, chest_5.class);
        startActivity(intent5);

    }
    public void chex6(){
        Intent intent6 = new Intent(this, chest_6.class);
        startActivity(intent6);

    }
}