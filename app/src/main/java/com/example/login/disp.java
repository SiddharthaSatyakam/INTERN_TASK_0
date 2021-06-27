package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class disp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disp);
        Intent receive= getIntent();
        String rec_msg= receive.getStringExtra(MainActivity.pass);
        TextView set_text= findViewById(R.id.receive_msg);
        set_text.setText(rec_msg);
    }
}