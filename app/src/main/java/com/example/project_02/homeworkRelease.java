package com.example.project_02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class homeworkRelease extends AppCompatActivity {

    private EditText editTextTitle, editTextDescription, editTextDeadline, editTextCourse;
    private Button buttonSelectDeadline, buttonPublishHW;
    private HWViewModel hwViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework_release);

        editTextTitle = findViewById(R.id.editTextTitle);
        editTextDescription = findViewById(R.id.editTextDescription);
        buttonPublishHW = findViewById(R.id.buttonPublishHW);

        hwViewModel = new ViewModelProvider(this).get(HWViewModel.class);

        buttonPublishHW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextTitle = findViewById(R.id.editTextTitle);
                EditText editTextDescription = findViewById(R.id.editTextDescription);

                if (editTextTitle != null && editTextDescription != null) {
                    String title = editTextTitle.getText().toString();
                    String description = editTextDescription.getText().toString();

                    if (!title.isEmpty() && !description.isEmpty()) {
                        // 如果标题和描述都不为空，则创建并插入HW对象到数据库
                        HW hw = new HW();
                        hw.setTitle(title);
                        hw.setDescription(description);
                        // 插入 HW 对象到数据库
                        hwViewModel.insertHw(hw);

                        // 提示已发布并返回上一个页面或其他操作
                        Toast.makeText(homeworkRelease.this, "作业已发布", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(homeworkRelease.this, AdminLanding.class));
                        finish();
                    } else {
                        // 如果标题或描述为空，则提示不能为空
                        Toast.makeText(homeworkRelease.this, "标题和描述不能为空", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    // 如果 EditText 对象为空，则处理相应的情况
                    // 比如，打印日志或者其他处理
                }

            }
        });
    }
}
