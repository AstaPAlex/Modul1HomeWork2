package org.example.homework.second.shop;

public enum Gender {
    MAN ("Мужчина"),
    WOMAN ("Женищна");

    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
