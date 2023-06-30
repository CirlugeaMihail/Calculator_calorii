package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {
 private Button buttonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


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