package com.workintech.abstraction.model;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getSalesPrice(int quantity){
        return quantity*price;
    }
    public abstract void showDetails();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Type: " + type);
        builder.append(" Description: " + description);
        builder.append(" Price: " + price);
        return builder.toString();
    }
}
