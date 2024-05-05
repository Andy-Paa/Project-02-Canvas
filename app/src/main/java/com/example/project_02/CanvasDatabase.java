package com.example.project_02;
import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {User.class}, version = 2)
public abstract class CanvasDatabase extends RoomDatabase {
    private static volatile CanvasDatabase instance;

    public abstract UserDAO userDao();

    public static synchronized CanvasDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            CanvasDatabase.class, "app_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
//    public abstract UserDAO userDao();
//
//    public static class DatabaseWriteExecutor {
//        private static final ExecutorService executor = Executors.newSingleThreadExecutor();
//
//        static void execute(Runnable runnable) {
//            executor.execute(runnable);
//        }
//    }
}
