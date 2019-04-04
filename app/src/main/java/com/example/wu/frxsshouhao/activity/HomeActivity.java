package com.example.wu.frxsshouhao.activity;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.wu.frxsshouhao.R;

public class HomeActivity extends AppCompatActivity {
    TextInputLayout userName;
    TextInputLayout password;
    private Button btnLogin;
    //
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = findViewById(R.id.login_in);
    }
}
