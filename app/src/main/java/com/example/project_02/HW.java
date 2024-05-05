package com.example.project_02;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "hw")
public class HW{
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String description;

    // Getters and setters...
}