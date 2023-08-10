package com.workintech.abstraction.model;

public class Coke extends ProductForSale{
    double acidRate;

    public Coke(String type, double price, String description, double acidRate) {
        super(type, price, description);
        this.acidRate = acidRate;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append(" Acid Rate: " + acidRate);
        System.out.println(result + builder.toString());
    }
}
