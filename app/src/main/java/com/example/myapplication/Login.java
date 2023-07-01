package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    private Button buttonBack;
    private EditText editText1;
    private EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText1 = findViewById(R.id.textUsername);
        editText1.setTextColor(Color.BLACK);
        editText2 = findViewById(R.id.textPassword);
        editText2.setTextColor(Color.BLACK);

        buttonBack = (Button) findViewById(R.id.btnBack);
        buttonBack.setOnClickListener(new View.OnClickListener()
        {@Override
        public void onClick(View v){
            openActivity5();}});

    }

    public void openActivity5()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}