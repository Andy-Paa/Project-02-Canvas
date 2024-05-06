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
                        HW hw = new HW();
                        hw.setTitle(title);
                        hw.setDescription(description);
                        // 插入 HW 对象到数据库
                        hwViewModel.insertHw(hw);

                        Toast.makeText(homeworkRelease.this, "published", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(homeworkRelease.this, AdminLanding.class));
                        finish();
                    } else {
                        Toast.makeText(homeworkRelease.this, "missing text", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
