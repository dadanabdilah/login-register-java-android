package com.abdilahstudio.loginregister;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button login, register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mengganti fragment
        loadFragment(new LoginFragment());

        login = findViewById(R.id.login);
        register = findViewById(R.id.register);

        login.setOnClickListener(V -> {
            loadFragment(new LoginFragment());
        });

        register.setOnClickListener(V -> {
            loadFragment(new RegisterFragment());
        });
    }

    public void  loadFragment(Fragment fragment){
        FragmentManager fm =getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(R.id.mainLayout, fragment);
        fragmentTransaction.commit();
    }
}