package com.example.mycolculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Add(View view){
        EditText num1=findViewById(R.id.ed_num1);
        EditText num2=findViewById(R.id.ed_num2);
        EditText res=findViewById(R.id.ed_res);

        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int result=n1-n2;
        res.setText(String.valueOf(result));
    }
}