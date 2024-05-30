package com.example.plantasks.model;

public class ToDoModel {
    private int id, status;
    private String task,desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDesc() {
        return task;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
