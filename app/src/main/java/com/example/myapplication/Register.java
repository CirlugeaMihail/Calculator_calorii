package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
 private Button buttonBack;
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private EditText editText5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editText1 = findViewById(R.id.Register_Mail);
        editText1.setTextColor(Color.BLACK);
        editText2 = findViewById(R.id.Register_password1);
        editText2.setTextColor(Color.BLACK);
        editText3 = findViewById(R.id.Register_password2);
        editText3.setTextColor(Color.BLACK);
        editText4 = findViewById(R.id.textInaltime);
        editText4.setTextColor(Color.BLACK);
        editText5 = findViewById(R.id.textGreutate);
        editText5.setTextColor(Color.BLACK);


        buttonBack = (Button) findViewById(R.id.btnBack);
        buttonBack.setOnClickListener(new View.OnClickListener()
        {@Override
        public void onClick(View v){
            openActivity4();}});



    }

    public void openActivity4()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}