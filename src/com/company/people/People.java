package com.company.people;

public class People {

    private int age;
    private int name;
    private char gender;
    private String race;

    public People(int age, int name, char gender, String race) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }


}
