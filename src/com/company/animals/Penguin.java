package com.company;

public class Penguin {

    private String Type;
    private double wingSpan;
    private String featherType;

    public Penguin(String type, double wingSpan, String featherType) {
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
