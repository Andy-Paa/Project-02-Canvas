package com.example.project_02;

import androidx.lifecycle.ViewModel;

public class UserViewModel extends ViewModel {
    private UserRepo userRepo;

    public UserViewModel(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void insertUser(User user) {
        userRepo.insertUser(user);
    }
}
