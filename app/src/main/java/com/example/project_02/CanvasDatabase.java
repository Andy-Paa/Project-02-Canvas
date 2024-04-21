package com.example.project_02;
import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, version = 1)
public abstract class CanvasDatabase extends RoomDatabase {
    public abstract UserDAO userDao();

}
