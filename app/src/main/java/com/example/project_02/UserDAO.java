package com.example.project_02;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.google.android.material.circularreveal.CircularRevealHelper;

import java.util.List;

@Dao
public interface UserDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(User... user);
    @Update
    void updateUser(User user);

    @Delete
    void deleteUser(User user);

    @Query("SELECT * FROM users WHERE userName = :userName")
    User getUserByName(String userName);

    @Query("SELECT * FROM users WHERE userId = :userId")
    User getUserById(int userId);

    @Query("SELECT * FROM users WHERE username = :username AND password = :password")
    User getUser(String username, String password);

    @Query("SELECT * FROM users")
    List<User> getAllUsers();
}
