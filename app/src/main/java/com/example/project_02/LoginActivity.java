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
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.AlertDialog;
import android.content.DialogInterface;


public class LoginActivity extends AppCompatActivity {
    private EditText editTextUsername, editTextPassword;
    private UserDAO userDAO;//static问题解决不了只能假设已经注入
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        editTextUsername = findViewById(R.id.userNameLoginEditText);
        editTextPassword = findViewById(R.id.passwordLoginEditText);
        Button buttonLogin = findViewById(R.id.loginButton);
        Button buttonRegister = findViewById(R.id.buttonRegister);


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
        buttonRegister.setOnClickListener(v -> showRegisterDialog());
    }
    private void showRegisterDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Register");
        View viewInflated = LayoutInflater.from(this).inflate(R.layout.register_dialog_layout, null);
        builder.setView(viewInflated);

        final EditText editTextUsername = viewInflated.findViewById(R.id.editTextUsername);
        final EditText editTextPassword = viewInflated.findViewById(R.id.editTextPassword);

        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //输入密码注册
                String username = editTextUsername.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                //注册逻辑
                registerUser(username, password);
            }
        });

        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                //取消
            }
        });

        builder.show();
    }

    private void registerUser(String username, String password) {
        userDAO.insert(new User(username, password));
    }

}


