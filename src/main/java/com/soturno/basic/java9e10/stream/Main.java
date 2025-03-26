package com.soturno.basic.java9e10.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        var numeros = List.of(1, 2, 3, 4, 5, 6);

        var pares = numeros.stream()
                .collect(Collectors.filtering(n -> n % 2 == 0, Collectors.toList()));

        System.out.println("numeros pares filtrados" + pares);

        /* */

        var listas = List.of(
                List.of("Java", "Kotlin"),
                List.of("Python", "C++")
        );

        System.out.println("lista original" + listas);

        var palavras = listas.stream()
                .collect(Collectors.flatMapping(List::stream, Collectors.toSet()));

        System.out.println("lista unificada " + palavras);



    }
}
