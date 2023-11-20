package com.example.z12;

import java.util.ArrayList;
import java.util.List;


interface Task {
    void print();
}


class SimpleTask implements Task {
    private String name;

    public SimpleTask(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Задача: " + name);
    }
}


class TaskList implements Task {
    private List<Task> tasks = new ArrayList<>();
    private String name;

    public TaskList(String name) {
        this.name = name;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void print() {
        System.out.println("Категория: " + name);
        for (Task task : tasks) {
            task.print();
        }
    }
}


public class TaskManager {
    public static void main(String[] args) {

        Task simpleTask1 = new SimpleTask("Покормить кота");
        Task simpleTask2 = new SimpleTask("Помыть посуду");


        TaskList category1 = new TaskList("Домашние дела");
        TaskList category2 = new TaskList("Личные дела");


        category1.addTask(simpleTask1);
        category1.addTask(simpleTask2);


        TaskList mainList = new TaskList("Главный список");
        mainList.addTask(category1);
        mainList.addTask(category2);


        mainList.print();
    }
}
