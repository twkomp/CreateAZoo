package com.company;

public class Lion {
    private double noseSize;
    private double ManeLength; // i feel like im developing some game like loe
    private boolean isTrained;

    public Lion(double noseSize, double maneLength, boolean isTrained) {
        this.noseSize = noseSize;
        ManeLength = maneLength;
        this.isTrained = isTrained;
    }

    public double getNoseSize() {

        return noseSize;
    }

    public void setNoseSize(double noseSize) {
        this.noseSize = noseSize;
    }

    public double getManeLength() {
        return ManeLength;
    }

    public void setManeLength(double maneLength) {
        ManeLength = maneLength;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }
}
