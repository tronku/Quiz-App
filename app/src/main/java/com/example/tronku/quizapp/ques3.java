package com.example.tronku.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ques3 extends AppCompatActivity {

    Button op1;
    Button op2;
    Button op3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques3);

        op1 = findViewById(R.id.option1);
        op2 = findViewById(R.id.option2);
        op3 = findViewById(R.id.option3);

        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ques2 = new Intent(ques3.this, ques4.class);
                startActivity(ques2);
            }
        });

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ques3.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Toast.makeText(ques3.this, "Score: 20", Toast.LENGTH_SHORT).show();
                Intent exit = new Intent(ques3.this, exit.class);
                startActivity(exit);
            }
        };

        op1.setOnClickListener(onClickListener);
        op3.setOnClickListener(onClickListener);
    }
    @Override
    protected void onStop(){
        super.onStop();
    }
    @Override
    protected void onPause() { super.onPause(); }
}
