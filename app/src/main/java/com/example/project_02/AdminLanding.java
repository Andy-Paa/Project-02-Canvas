package com.example.project_02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class AdminLanding extends AppCompatActivity {

    private HWViewModel hwViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_landing_activities);

        // 初始化ViewModel
        hwViewModel = new ViewModelProvider(this).get(HWViewModel.class);

        // 设置按钮点击事件
        Button buttonPublishJob = findViewById(R.id.buttonPublishJob);
        Button buttonAddMember = findViewById(R.id.buttonAddMember);
        Button buttonEmpty1 = findViewById(R.id.buttonEmpty1);
        Button buttonEmpty2 = findViewById(R.id.buttonEmpty2);
        Button buttonLogout = findViewById(R.id.buttonLogout);

        buttonPublishJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminLanding.this, homeworkRelease.class));
                finish();
            }
        });

        buttonAddMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        buttonEmpty1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        buttonEmpty2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminLanding.this, LoginActivity.class));
                finish();
            }
        });
    }
}
