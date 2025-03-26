package com.soturno.basic.java9e10.Optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Optional<String> nome = Optional.of("Java");

        nome.ifPresentOrElse(
                valor -> System.out.println("Nome: " + valor),
                () -> System.out.println("Nome não presente")
        );

        Optional<String> nome1 = Optional.empty();
        nome1.ifPresentOrElse(
                valor -> System.out.println("Nome: " + valor),
                () -> System.out.println("Nome não presente")
        );

        Optional<String> palavra = Optional.empty();
        Optional<String> outroNome = palavra.or(() -> Optional.of("Padrão"));

        System.out.println(outroNome.get());

        /****************************************/

        var lista = List.of(Optional.of("Java"), Optional.empty(), Optional.of("Kotlin"));

        var nomes = lista.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());

        System.out.println(nomes);

    }
}
