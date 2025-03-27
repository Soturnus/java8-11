package com.soturno.basic.java11.metodosutilitarios;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {

    public static void main(String[] args) {

        List<String> lista = List.of("Java 8", "Java 9", "Java 11");
        List<String> imutavel = lista.stream().collect(Collectors.toUnmodifiableList());

//        imutavel.add("Java 17");
        System.out.println(imutavel);

    }
}
