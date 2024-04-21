package com.example.project_02;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class MySQLUserDAO implements UserDAO {
    private Connection connection;

    public MySQLUserDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(String userName) {

    }

    @Override
    public User getUserByName(String userName) {
        return null;
    }

    @Override
    public int getUserById(int userId) {
        return 0;
    }

}

