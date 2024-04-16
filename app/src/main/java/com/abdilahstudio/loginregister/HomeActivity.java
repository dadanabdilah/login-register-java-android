package com.abdilahstudio.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    LinearLayout linearEmail;
    TextView TextUsername, TextPassword, TextEmail, Title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String username = getIntent().getStringExtra("username");
        TextUsername = findViewById(R.id.textUsername);
        TextUsername.setText(username);

        TextPassword = findViewById(R.id.textPassword);
        TextPassword.setText(getIntent().getStringExtra("password"));

        String isLogin = getIntent().getStringExtra("isLogin");
        if(isLogin != null && isLogin.equals("true")) {
            Title = findViewById(R.id.title);
            Title.setText("Login Success");

            linearEmail = findViewById(R.id.linear_email);
            linearEmail.setVisibility(View.GONE);

        } else {
            Title = findViewById(R.id.title);
            Title.setText("Register Success");

            TextEmail = findViewById(R.id.textEmail);
            TextEmail.setText(getIntent().getStringExtra("email"));

            linearEmail = findViewById(R.id.linear_email);
            linearEmail.setVisibility(View.VISIBLE);
        }
    }
}