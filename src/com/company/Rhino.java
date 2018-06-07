package com.company;

public class Rhino {
    private double hornSize;
    private double Type;
    private boolean isEndangered;

    public Rhino(double hornSize, double type, boolean isEndangered) {
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
