package com.company.inventory;

public class Item {

    private boolean inStock;
    private String name;
    private int numberInStock;
    private double price;
    private int itemId;


    public Item(boolean inStock, String name, int numberInStock, double price) {
        this.inStock = inStock;
        this.name = name;
        this.numberInStock = numberInStock;
        this.price = price;
    }


    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {

        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }
}
