package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class back extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6,button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_back);
        getSupportActionBar().setTitle("Back");
        button1=(Button) findViewById(R.id.bk1);
        button2=(Button) findViewById(R.id.bk2);
        button3=(Button) findViewById(R.id.bk3);
        button4=(Button) findViewById(R.id.bk4);
        button5=(Button) findViewById(R.id.bk5);
        button6=(Button) findViewById(R.id.bk6);
        button7=(Button) findViewById(R.id.bk7);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bcex1();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bcex2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bcex3();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bcex4();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bcex5();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bcex6();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bcex7();
            }
        });

    }
    public void bcex1(){
        Intent intent1 = new Intent(this, back_1.class);
        startActivity(intent1);

    }
    public void bcex2(){
        Intent intent2 = new Intent(this, back_2.class);
        startActivity(intent2);

    }
    public void bcex3(){
        Intent intent3 = new Intent(this, back_3.class);
        startActivity(intent3);

    }
    public void bcex4(){
        Intent intent4 = new Intent(this, back_4.class);
        startActivity(intent4);

    }
    public void bcex5(){
        Intent intent5 = new Intent(this, back_5.class);
        startActivity(intent5);

    }
    public void bcex6(){
        Intent intent6 = new Intent(this, back_6.class);
        startActivity(intent6);

    }
    public void bcex7(){
        Intent intent7 = new Intent(this, back_7.class);
        startActivity(intent7);

    }
}
