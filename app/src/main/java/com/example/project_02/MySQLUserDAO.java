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
        // 实现添加用户到数据库的逻辑
    }

    @Override
    public void updateUser(User user) {
        // 实现更新用户信息到数据库的逻辑
    }

    @Override
    public void deleteUser(String userName) {

    }

    @Override
    public User getUserByName(String userName) {
        return null;
    }

}

