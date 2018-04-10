package com.example.tronku.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ques4 extends AppCompatActivity {

    Button op1;
    Button op2;
    Button op3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques4);

        op1 = findViewById(R.id.option1);
        op2 = findViewById(R.id.option2);
        op3 = findViewById(R.id.option3);

        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ques2 = new Intent(ques4.this, ques5.class);
                startActivity(ques2);
            }
        });

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ques4.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Toast.makeText(ques4.this, "Score: 30", Toast.LENGTH_SHORT).show();
                Intent exit = new Intent(ques4.this, exit.class);
                startActivity(exit);
            }
        };

        op1.setOnClickListener(onClickListener);
        op2.setOnClickListener(onClickListener);
    }
    @Override
    protected void onStop(){
        super.onStop();
    }
    @Override
    protected void onPause() { super.onPause(); }
}
