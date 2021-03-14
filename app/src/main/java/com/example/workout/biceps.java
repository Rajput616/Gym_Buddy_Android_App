package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class biceps extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6,button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_biceps);
        getSupportActionBar().setTitle("Biceps");
        button1=(Button) findViewById(R.id.bc1);
        button2=(Button) findViewById(R.id.bc2);
        button3=(Button) findViewById(R.id.bc3);
        button4=(Button) findViewById(R.id.bc4);
        button5=(Button) findViewById(R.id.bc5);
        button6=(Button) findViewById(R.id.bc6);
        button7=(Button) findViewById(R.id.bc7);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bex1();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bex2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bex3();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bex4();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bex5();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bex6();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bex7();
            }
        });

    }
    public void bex1(){
        Intent intent1 = new Intent(this, biceps_1.class);
        startActivity(intent1);

    }
    public void bex2(){
        Intent intent2 = new Intent(this, biceps_2.class);
        startActivity(intent2);

    }
    public void bex3(){
        Intent intent3 = new Intent(this, biceps_3.class);
        startActivity(intent3);

    }
    public void bex4(){
        Intent intent4 = new Intent(this, biceps_4.class);
        startActivity(intent4);

    }
    public void bex5(){
        Intent intent5 = new Intent(this, biceps_5.class);
        startActivity(intent5);

    }
    public void bex6(){
        Intent intent6 = new Intent(this, biceps_6.class);
        startActivity(intent6);

    }
    public void bex7(){
        Intent intent7 = new Intent(this, biceps_7.class);
        startActivity(intent7);

    }
}

