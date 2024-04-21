package com.example.project_02;
import static android.content.ClipData.newIntent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.example.project_02.databinding.ActivityMainBinding;


public class LoginActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    static Intent loginIntentFactory(Context context){
                return new Intent(String.valueOf(context));
    }
}



