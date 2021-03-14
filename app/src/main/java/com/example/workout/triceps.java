package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class triceps extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_triceps);
        getSupportActionBar().setTitle("Triceps");
        button1=(Button) findViewById(R.id.tr1);
        button2=(Button) findViewById(R.id.tr2);
        button3=(Button) findViewById(R.id.tr3);
        button4=(Button) findViewById(R.id.tr4);
        button5=(Button) findViewById(R.id.tr5);
        button6=(Button) findViewById(R.id.tr6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex1();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex3();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex4();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex5();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex6();
            }
        });

    }
    public void tex1(){
        Intent intent1 = new Intent(this,triceps_1.class);
        startActivity(intent1);

    }
    public void tex2(){
        Intent intent2 = new Intent(this,triceps_2.class);
        startActivity(intent2);

    }
    public void tex3(){
        Intent intent3 = new Intent(this, triceps_3.class);
        startActivity(intent3);

    }
    public void tex4(){
        Intent intent4 = new Intent(this, triceps_4.class);
        startActivity(intent4);

    }
    public void tex5(){
        Intent intent5 = new Intent(this, triceps_5.class);
        startActivity(intent5);

    }
    public void tex6(){
        Intent intent6 = new Intent(this, triceps_6.class);
        startActivity(intent6);

    }
}
