package com.workintech.abstraction.main;

import com.workintech.abstraction.model.*;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Bread("Wheat",10,"Delicious bread!",80);
        products[1] = new Chocolate("Dark",15,"Tasty!",75);
        products[2] = new Coke("CokaCola",30,"FizzBuzz!",45);
        listProducts(products);

        System.out.println("------------------------------");

        Monster vampire = new Vampire("Vampire1",100,25);
        Monster nerubian = new Nerubian("Nerub1",100,30);
        vampire.attack();
        nerubian.attack();
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products){
            if(product != null){
                product.showDetails();
            }

        }
    }
}