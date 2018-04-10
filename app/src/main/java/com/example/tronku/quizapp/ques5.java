package com.example.tronku.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ques5 extends AppCompatActivity {

    Button op1;
    Button op2;
    Button op3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques5);

        op1 = findViewById(R.id.option1);
        op2 = findViewById(R.id.option2);
        op3 = findViewById(R.id.option3);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ques5.this, "You and the creator are awesome!", Toast.LENGTH_SHORT).show();
                Toast.makeText(ques5.this, "Score: 50", Toast.LENGTH_SHORT).show();
                Intent win = new Intent(ques5.this, win.class);
                startActivity(win);
            }
        };

        op1.setOnClickListener(onClickListener);
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
