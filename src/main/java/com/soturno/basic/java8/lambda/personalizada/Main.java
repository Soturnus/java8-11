package com.soturno.basic.java8.lambda.personalizada;

public class Main {
    public static void main(String[] args) {

        Product notebook = new Product("Notebook", 5000.00);

        // Usando lambda para obter o nome do produto
        String name = ProductProcessor.process(notebook, Product::getName);
        System.out.println("Nome do produto: " + name);

        // Usando lambda para formatar o preço do produto
        String priceFormatted = ProductProcessor.process(notebook, p -> "R$ " + String.format("%.2f", p.getPrice()));
        System.out.println("Preço formatado: " + priceFormatted);

        // Usando lambda para aplicar desconto e retornar o novo preço
        double discountedPrice = ProductProcessor.process(notebook, p -> p.getPrice() * 0.9);
        System.out.println("Preço com desconto: R$ " + String.format("%.2f", discountedPrice));


    }
}