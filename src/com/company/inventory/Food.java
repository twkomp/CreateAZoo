package com.company.inventory;

public class Food extends Item {
    
    private String expirationDate;
    private String Category;
    private boolean refrigerated;


    public Food(boolean inStock, String name, int numberInStock, double price, String expirationDate, String category, boolean refrigerated) {
        super(inStock, name, numberInStock, price);
        this.expirationDate = expirationDate;
        Category = category;
        this.refrigerated = refrigerated;
    }



    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public boolean isRefrigerated() {
        return refrigerated;
    }

    public void setRefrigerated(boolean refrigerated) {
        this.refrigerated = refrigerated;
    }
}
