package com.example.project_02;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface HWDAO{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(HW hw);

    @Query("SELECT * FROM hw")
    List<HW> getAllProjects();
}
