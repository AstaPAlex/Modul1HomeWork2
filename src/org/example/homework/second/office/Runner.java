package org.example.homework.second.office;

public class Runner {
    public static void start() {
        Boss boss = new Boss("Петр Николаевич");
        Manager manager = new Manager("Володя");
        Security security = new Security("Петрович");
        Secretary  secretary = new Secretary();
        Office office = new Office(boss, manager, secretary, security);
        office.wordDay();
    }
}
