package com.example.tronku.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class exit extends AppCompatActivity {
    TextView replay;
    TextView exit;
    TextView scoreview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);

        replay = findViewById(R.id.replay);
        exit = findViewById(R.id.exit);
        //scoreview = findViewById(R.id.score_value);
        //scoreview.setText(ques1.score.getInt(ques1.value));
        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(exit.this, "Welcome again!", Toast.LENGTH_SHORT).show();
                Intent replay = new Intent(exit.this, ques1.class);
                startActivity(replay);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
    @Override
    protected void onStop(){
        super.onStop();
    }
}
