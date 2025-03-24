package com.soturno.basic.java8.streams;

import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Lambda", "Stream", "API");

        palavras.stream()
                .filter(p -> p.length() > 4)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
