package com.example.project_02;

public class UserRepo {
    private UserDAO userDAO;

    public UserRepo(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void insertUser(User user) {
        userDAO.insert(user);
    }
}