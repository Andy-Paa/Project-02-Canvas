package com.example.project_02;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {User.class}, version = 1)
public abstract class CanvasDatabase extends RoomDatabase {
    public abstract UserDAO userDao();

    public static class DatabaseWriteExecutor {
        private static final ExecutorService executor = Executors.newSingleThreadExecutor();

        static void execute(Runnable runnable) {
            executor.execute(runnable);
        }
    }
}
