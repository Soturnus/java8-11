package com.soturno.basic.java8.lambda.personalizada;

public class Product {

    private String name;
    private Double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Produto: " + name + " - Preço: R$ " + price;
    }

}
