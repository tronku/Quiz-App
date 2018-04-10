package com.example.tronku.quizapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ques1 extends AppCompatActivity {
    public final static String scorefile = "Score_Value";
    public SharedPreferences score;
    Button op1;
    Button op2;
    Button op3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques1);

        score = getSharedPreferences(scorefile, Context.MODE_MULTI_PROCESS);
        op1 = findViewById(R.id.option1);
        op2 = findViewById(R.id.option2);
        op3 = findViewById(R.id.option3);

        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor edit_score = score.edit();
                edit_score.putInt("Score", 10);
                edit_score.apply();
                Intent ques2 = new Intent(ques1.this, ques2.class);
                startActivity(ques2);
            }
        });

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ques1.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Toast.makeText(ques1.this, "Score: 0", Toast.LENGTH_SHORT).show();
                Intent exit = new Intent(ques1.this, exit.class);
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
