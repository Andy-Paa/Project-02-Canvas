package com.example.project_02;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.example.project_02.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {
    private TextView textViewWelcomeMessage;
    private Button buttonLogout;
    private UserDAO userDAO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //教授
        Executors.newSingleThreadExecutor().execute(() -> {
            userDAO = CanvasDatabase.getInstance(this).userDao();
            //用户名为 "Drew"，密码为 "cst338"，角色为 "Professor"
            User Professor = new User("Drew", "cst338");
            Professor.setProfessor(true);
            userDAO.insert(Professor);
        });
        textViewWelcomeMessage = findViewById(R.id.textViewWelcomeMessage);
        buttonLogout = findViewById(R.id.buttonLogout);

        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //返回登录界面
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                finish(); //关闭
            }
        });
    }
}

/*
 * below was studying the example from class video (GymLog)
 * */
//public class MainActivity extends AppCompatActivity {


//    private ViewDataBinding binding;
//    private Repo repo;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//
//
//        repo= repo.getInstance(getApplication());

//        binding.HwDisplayTextView.setMovementMethod(new ScrollingMovementMethod());

//        binding.logButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                getInformationFromDisplay();
//                insert();
//
//                updateDisplay();
//            }
//        });


//        binding.InputEditText.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                updateDisplay();
//            }
//        });
//    }
//        private void updateDisplay() {
//        }
//    }
//}
