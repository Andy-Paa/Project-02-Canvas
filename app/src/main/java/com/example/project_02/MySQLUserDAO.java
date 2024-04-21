package com.example.project_02;
import java.sql.Connection;

public class MySQLUserDAO implements UserDAO {
    private Connection connection;

    public MySQLUserDAO(Connection connection) {
        this.connection = connection;
    }



    @Override
    public void insert(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }


    @Override
    public User getUserByName(String userName) {
        return null;
    }

    @Override
    public User getUserById(int userId) {
        return null;
    }

}

