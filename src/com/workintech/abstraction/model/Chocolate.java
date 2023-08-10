package com.workintech.abstraction.model;

public class Chocolate extends ProductForSale{
    int cacaoRate;

    public Chocolate(String type, double price, String description, int cacaoRate) {
        super(type, price, description);
        this.cacaoRate = cacaoRate;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append(" Cacao Rate: " + cacaoRate);
        System.out.println(result + builder.toString());
    }
}
