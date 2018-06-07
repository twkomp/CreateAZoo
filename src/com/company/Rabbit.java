package com.company;

public class Rabbit extends Animal {
    private double earLength;
    private String furColor;
    private String favoriteFood;


    public Rabbit(double earLength, String furColor, String favoriteFood) {
        this.earLength = earLength;
        this.furColor = furColor;
        this.favoriteFood = favoriteFood;
    }

    public double getEarLength() {
        return earLength;
    }

    public void setEarLength(double earLength) {
        this.earLength = earLength;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
