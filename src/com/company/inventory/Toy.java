package com.company.inventory;

public class Toy extends Item {

    private double price;
    private int itemId;
    private boolean seasonal;

    public Toy(boolean inStock, String name, int numberInStock, double price, double price1, int itemId, boolean seasonal) {
        super(inStock, name, numberInStock, price);
        this.price = price1;
        this.itemId = itemId;
        this.seasonal = seasonal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public boolean isSeasonal() {
        return seasonal;
    }

    public void setSeasonal(boolean seasonal) {
        this.seasonal = seasonal;
    }
}
