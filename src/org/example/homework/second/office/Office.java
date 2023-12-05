package org.example.homework.second.office;

public class Office {
    private Boss boss;
    private Manager manager;
    private Secretary secretary;
    private Security security;

    public Office(Boss boss, Manager manager, Secretary secretary, Security security) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.security = security;
    }

    public void wordDay() {
        boss.yellAtManager(manager);
        manager.cry();
        security.askingAdvances();
        secretary.reassure(boss, manager, security);
    }

}
