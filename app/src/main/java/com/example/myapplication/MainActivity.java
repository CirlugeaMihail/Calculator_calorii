package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        private Button buttonLog;
        private Button buttonReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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