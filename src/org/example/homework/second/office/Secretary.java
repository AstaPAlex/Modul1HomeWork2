package org.example.homework.second.office;

public class Secretary {
    public void reassure(Boss boss, Manager manager, Security security) {
        System.out.printf("Секретарь: %s не волнуйтесь, %s все успеет. %s - подождите!\n", boss.getName(), manager.getName(), security.getName());
    }
}
