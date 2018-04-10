package com.example.tronku.quizapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class login extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    EditText name;
    EditText mailid;
    EditText avatar;
    Button enter;
    public String usrname;
    public final static String mypref = "mypref";
    public final static String username = "avatar";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sharedPreferences = getSharedPreferences(mypref, Context.MODE_MULTI_PROCESS);
        name = findViewById(R.id.name);
        mailid = findViewById(R.id.mail_id);
        avatar = findViewById(R.id.avatar);
        enter = findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkdata();
            }
        });
    }
    boolean isempty(EditText text)
    {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }
    boolean isvalid(EditText text)
    {
        CharSequence str = text.getText().toString();
        return (!TextUtils.isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches());
    }
    public void checkdata()
    {
        if(isempty(name) && isempty(avatar) && !isvalid(mailid))
            Toast.makeText(this, "Please enter all the details", Toast.LENGTH_SHORT).show();
        else if(isempty(name))
            Toast.makeText(this,"Enter Name!",Toast.LENGTH_SHORT).show();
        else if(isempty(avatar))
            Toast.makeText(this, "Enter Avatar", Toast.LENGTH_SHORT).show();
        else if(!isvalid(mailid))
            Toast.makeText(this, "Invalid mail-id", Toast.LENGTH_SHORT).show();
        else{
            usrname = avatar.getText().toString();
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(username,usrname);
            editor.apply();
            Toast.makeText(this, "Welcome " + usrname +"!", Toast.LENGTH_SHORT).show();
            Intent ques = new Intent(login.this, ques1.class);
            startActivity(ques);
        }
    }
    @Override
    protected void onStop(){
        super.onStop();
    }
    @Override
    protected void onPause() { super.onPause(); }
}
