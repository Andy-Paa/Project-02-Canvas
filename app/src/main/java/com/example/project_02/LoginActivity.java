package com.example.project_02;
import static android.content.ClipData.newIntent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.example.project_02.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        editTextUsername = findViewById(R.id.userNameLoginEditText);
        editTextPassword = findViewById(R.id.passwordLoginEditText);
        buttonLogin = findViewById(R.id.loginButton);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //验证登录
                String username = editTextUsername.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                /*
                * 还没写验证步骤
                * */
                //if
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                finish(); //关当前页面
            }
        });
    }
}


