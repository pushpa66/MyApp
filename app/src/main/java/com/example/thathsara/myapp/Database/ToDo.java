package com.example.thathsara.myapp.Database;


public class ToDo {
    public static final String TABLE_NAME = "todo";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_DESCRIPTION = "todo";
    public static final String COLUMN_TIMESTAMP = "timestamp";

    private long id;
    private String todo;
    private String timestamp;


    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_DESCRIPTION + " TEXT,"
                    + COLUMN_TIMESTAMP + " TEXT"
                    + ")";

    public ToDo(){

    }

    public ToDo(String description, String timestamp) {
        this.todo = description;
        this.timestamp = timestamp;
    }

    public ToDo(long id, String description, String timestamp) {
        this.id = id;
        this.todo = description;
        this.timestamp = timestamp;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
