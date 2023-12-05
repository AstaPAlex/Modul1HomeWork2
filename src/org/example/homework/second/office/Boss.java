package org.example.homework.second.office;

public class Boss {
    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public void yellAtManager(Manager manager) {
        System.out.printf("Босс: %s быстрее!\n", manager.getName());
    }

    public String getName() {
        return name;
    }
}
