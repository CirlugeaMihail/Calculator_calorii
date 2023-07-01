package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
        private Button buttonLog;
        private Button buttonReg;
        private EditText editText1;
        private EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.textUsername);
        editText1.setTextColor(Color.BLACK);
        editText2 = findViewById(R.id.textPassword);
        editText2.setTextColor(Color.BLACK);



        buttonLog = (Button) findViewById(R.id.btnLogin);
        buttonLog.setOnClickListener(new View.OnClickListener()
        {@Override
        public void onClick(View v){
            openActivity2();}});

        buttonReg = (Button) findViewById(R.id.btnRegister);
        buttonReg.setOnClickListener(new View.OnClickListener()
        {@Override
        public void onClick(View v){
            openActivity3();}});

    }
    public void openActivity2()
    {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void openActivity3()
    {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }





   // public void  Register(View view){
      //  setContentView(R.layout.register_layout);

    //}
   // public void  BackToLogin(View view){
      //  setContentView(R.layout.activity_main);

   // }
}