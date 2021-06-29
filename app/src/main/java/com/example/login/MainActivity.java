
package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String pass="com.example.login.message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.butn);
        btn.setOnClickListener(this::newpage);
    }
    public void newpage(View view)
    {
        Intent obj= new Intent(this , disp.class);
        EditText pers_name = findViewById(R.id.name);
        EditText b_ranch = findViewById(R.id.Branch);
        EditText years = findViewById(R.id.year);
        EditText reg_no = findViewById(R.id.regno);
        String msg= "NAME:- "+"  "+pers_name.getText().toString()+"\n\n"+"BRANCH:-"+"  "+b_ranch.getText().toString()+"\n\n"+
                "YEAR:- "+"  "+years.getText().toString()+"\n\n"+"REGD.NO:- "+"  "+
                reg_no.getText().toString();
        obj.putExtra(pass,msg);
        startActivity(obj);
    }
}