package com.company.animals;
// whyyyy???  (forgot extends Animal)
public class Animal {
    private String name;
    private String location;
    private char gender;
    private double weight;

    public String getName() {
        return name;
    }

    public Animal(String name, String location, char gender, double weight) {
        this.name = name;
        this.location = location;
        this.gender = gender;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
