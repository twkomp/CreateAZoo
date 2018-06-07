package com.company.animals;

public class Penguin extends Animal {

    private String Type;
    private double wingSpan;
    private String featherType;

    public Penguin(String name, String location, char gender, double weight, String type, double wingSpan, String featherType) {
        super(name, location, gender, weight);
        Type = type;
        this.wingSpan = wingSpan;
        this.featherType = featherType;
    }

    public String getType() {

        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public String getFeatherType() {
        return featherType;
    }

    public void setFeatherType(String featherType) {
        this.featherType = featherType;
    }
}
