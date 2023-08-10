package com.workintech.abstraction.model;

public class Bread extends ProductForSale{
    double grainRate;

    public Bread(String type, double price, String description, double grainRate) {
        super(type, price, description);
        this.grainRate = grainRate;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append(" Grain Rate: " + grainRate);
        System.out.println(result + builder.toString());
    }
}
