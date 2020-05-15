package com.myapplicationdev.android.demodatabase;

public class Task {
    private int id;
    private String description;
    private String data;

    public Task(int id, String description, String data){
        this.id = id;
        this.description = description;
        this.data = data;

    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getData() {
        return data;
    }
}
