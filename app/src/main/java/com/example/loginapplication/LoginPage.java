package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        Button login_btn = findViewById(R.id.login_btn);
        EditText user_textview = findViewById(R.id.user_textView_login);
        EditText pass_textview = findViewById(R.id.pass_textView);
        TextView error_textview = findViewById(R.id.error_textview);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = user_textview.getText().toString();
                String password = pass_textview.getText().toString();

                if (username.length() > 0 && password.length() > 0) {
                    error_textview.setVisibility(View.INVISIBLE);
                    Intent home_page_intent = new Intent(getApplicationContext(), HomePage.class);
                    home_page_intent.putExtra("com.example.loginapplication.Arnob", username);
                    startActivity(home_page_intent);
                }
                else {
                    error_textview.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}