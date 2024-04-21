package com.example.project_02;


public interface UserDAO {

    void addUser(User user);
    void updateUser(User user);
    void deleteUser(String userName);
    User getUserByName(String userName);

    int getUserById(int userId);
}
