package com.soturno.basic.java9e10.examplevar;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

//    var nome = "Teste"; // ERRO: `var` não pode ser usado para atributos de classe
//
//    public void metodo(var parametro) { // ERRO: `var` não pode ser usado como parâmetro
//        System.out.println(parametro);
//    }

    public static void main(String[] args) {

//        {
//            var nome = "Java"; // Bloco de inicialização de instância
//        }
//
//        static {
//            var versao = 10; // Bloco de inicialização estático
//        }
//
//        public void metodo() {
//            var idade = 25; // Permitido dentro de métodos locais
//        }
//
//        var nome = "Teste"; // ERRO: `var` não pode ser usado para atributos de classe
//
//        public void metodo(var parametro) { // ERRO: `var` não pode ser usado como parâmetro
//            System.out.println(parametro);
//        }

//        var nome; // ERRO: O tipo não pode ser inferido sem inicialização
//        nome = "Teste";

        /*******************/

        var mensagem = "Olá, Java 10!";
        var numero = 42;
        var decimal = 3.14;

        System.out.println("Tipo: " + mensagem.getClass().getSimpleName());
        System.out.println("Numero: " + numero);
        System.out.println("Decimal: " + decimal);

        var numeros = List.of(1, 2, 3, 4, 5);
        var dobrados = numeros.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("Numeros dobrados usando var " + dobrados);

        for (var i = 0; i < 5; i++) {
            System.out.println("Contador: " + i);
        }

        try (var scanner = new Scanner(System.in)) {
            System.out.print("Digite algo: ");
            var input = scanner.nextLine();
            System.out.println("Você digitou: " + input);
        }
    }
}
