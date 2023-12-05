package org.example.homework.second.shop;

public class Runner {
    public static void start() {
        Item hammer = new Item("Молот", 1000);
        Item screwdriver = new Item("Отвертка", 50);
        Item notebook = new Item("Тетрадь", 30);
        Item pen = new Item("Ручка", 10);
        Worker worker1 = new Worker("Василий", 30, Gender.MAN, new Item[] {hammer, screwdriver});
        Worker worker2 = new Worker("Марьяна", 25, Gender.WOMAN, new Item[] {notebook, pen});
        Shop shop = new Shop(new Worker[] {worker1, worker2});
        shop.showWorkers();
        for (var worker : shop.getWorkers()) {
            worker.brag();
        }
    }
}
