package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class shoulder extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_shoulder);
        getSupportActionBar().setTitle("Shoulder");
        button1=(Button) findViewById(R.id.sh1);
        button2=(Button) findViewById(R.id.sh2);
        button3=(Button) findViewById(R.id.sh3);
        button4=(Button) findViewById(R.id.sh4);
        button5=(Button) findViewById(R.id.sh5);
        button6=(Button) findViewById(R.id.sh6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shex1();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shex2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shex3();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shex4();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shex5();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shex6();
            }
        });

    }
    public void shex1(){
        Intent intent1 = new Intent(this, shoulder_1.class);
        startActivity(intent1);

    }
    public void shex2(){
        Intent intent2 = new Intent(this, shoulder_2.class);
        startActivity(intent2);

    }
    public void shex3(){
        Intent intent3 = new Intent(this, shoulder_3.class);
        startActivity(intent3);

    }
    public void shex4(){
        Intent intent4 = new Intent(this, shoulder_4.class);
        startActivity(intent4);

    }
    public void shex5(){
        Intent intent5 = new Intent(this, shoulder_5.class);
        startActivity(intent5);

    }
    public void shex6(){
        Intent intent6 = new Intent(this, shoulder_6.class);
        startActivity(intent6);

    }
}
