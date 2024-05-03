package com.example.project_02;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.google.android.material.circularreveal.CircularRevealHelper;
@Dao
public interface UserDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    default void insert(User... user) {
        
    }
    @Update
    void updateUser(User user);

    @Delete
    void deleteUser(User user);

    @Query("SELECT * FROM User WHERE userName = :userName")
    User getUserByName(String userName);

    @Query("SELECT * FROM User WHERE userId = :userId")
    User getUserById(int userId);
}
