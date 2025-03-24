package com.soturno.basic.java8.staticanddefault;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.acelerar();
        carro.buzinar(); // Chama o método default da interface

        Veiculo.mostrarInfo(); //É chamado direto da interface

    }

}
