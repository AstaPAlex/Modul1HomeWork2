package org.example.homework.second.shop;

public class Shop {
    private Worker[] workers;

    public Shop(Worker[] workers) {
        this.workers = workers;
    }

    public void showWorkers() {
        for (var worker : workers) {
            System.out.printf("%s: %d лет, %s, Список вещей: ", worker.getName(), worker.getAge(), worker.getGender());
            worker.showItems();
            System.out.println();
        }
    }

    public Worker[] getWorkers() {
        return workers;
    }
}
