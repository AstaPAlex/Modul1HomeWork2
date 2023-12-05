package org.example.homework.second.shop;

public class Worker {
    private final String name;
    private final int age;
    private final Item[] items;
    private final Gender gender;

    public Worker(String name, int age, Gender gender, Item[] items) {
        this.name = name;
        this.age = age;
        this.items = items;
        this.gender = gender;
    }

    public void brag() {
        for (Item item : items) {
            System.out.printf("%s: смотрите какая у меня вещь - %s\n", name, item.getName());
        }
    }

    public void showItems() {
        for (var item : items) {
            System.out.print(item.getName() + " ");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender.getGender();
    }
}
