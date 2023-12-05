package org.example.homework.second.office;

public class Security {
    private String name;

    public Security(String name) {
        this.name = name;
    }

    public void askingAdvances() {
        System.out.println("Охранник: Дайте мне аванс!");
    }

    public String getName() {
        return name;
    }
}
