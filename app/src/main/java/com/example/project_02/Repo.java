package com.example.project_02;

import android.app.Application;

public class Repo {

    private UserDAO userDAO;

    private void insertUser(User... user){
        CanvasDatabase.DatabaseWriteExecutor.execute(() ->
                {userDAO.insert(user);}
                );
    }

    public Repo getInstance(Application application){
        return null;
    }
}
