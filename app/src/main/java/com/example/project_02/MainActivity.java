package com.example.project_02;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.example.project_02.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ViewDataBinding binding;
    private Repo repo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        repo= repo.getInstance(getApplication());

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
    }
}
