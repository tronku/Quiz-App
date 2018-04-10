package com.example.tronku.quizapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ques2 extends AppCompatActivity {

    Button op1;
    Button op2;
    Button op3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques2);

        op1 = findViewById(R.id.option1);
        op2 = findViewById(R.id.option2);
        op3 = findViewById(R.id.option3);

        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ques2 = new Intent(ques2.this, ques3.class);
                startActivity(ques2);
            }
        });

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ques2.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Toast.makeText(ques2.this, "Score: 10", Toast.LENGTH_SHORT).show();
                Intent exit = new Intent(ques2.this, exit.class);
                startActivity(exit);
            }
        };

        op2.setOnClickListener(onClickListener);
        op3.setOnClickListener(onClickListener);
    }
    @Override
    protected void onStop(){
        super.onStop();
    }
    @Override
    protected void onPause() { super.onPause(); }
}
