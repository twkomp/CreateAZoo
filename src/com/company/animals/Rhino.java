package com.company.animals;

public class Rhino extends Animal {
    private double hornSize;
    private double Type;
    private boolean isEndangered;

    public Rhino(String name, String location, char gender, double weight, double hornSize, double type, boolean isEndangered) {
        super(name, location, gender, weight);
        this.hornSize = hornSize;
        Type = type;
        this.isEndangered = isEndangered;
    }

    public double getHornSize() {

        return hornSize;
    }

    public void setHornSize(double hornSize) {
        this.hornSize = hornSize;
    }

    public double getType() {
        return Type;
    }

    public void setType(double type) {
        Type = type;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }
}
