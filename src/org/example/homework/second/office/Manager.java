package org.example.homework.second.office;

public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public void cry() {
        System.out.println("Менеджер: я ничего не успеваю, помогите!");
    }

    public String getName() {
        return name;
    }
}
