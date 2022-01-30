package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        if (getIntent().hasExtra("com.example.loginapplication.Arnob")){
            TextView user_textview = findViewById(R.id.user_textView_home);
            user_textview.setText(getIntent().getExtras().getString("com.example.loginapplication.Arnob"));
        }

        Button next_btn = findViewById(R.id.next_btn_home);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent osList_intent = new Intent(getApplicationContext(), OSList.class);
                startActivity(osList_intent);
            }
        });

    }
}