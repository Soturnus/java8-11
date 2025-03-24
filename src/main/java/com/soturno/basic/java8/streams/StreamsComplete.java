package com.soturno.basic.java8.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsComplete {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Example", "Operations", "Intermediate", "Terminal");

        // Criando a Stream e aplicando todas as operações intermediárias
        List<String> result = words.stream()
                .filter(s -> s.length() > 3) // Filtra palavras com mais de 3 caracteres
                .map(String::toUpperCase) // Converte para maiúsculas
                .flatMap(s -> Arrays.stream(s.split(""))) // Transforma cada palavra em uma sequência de caracteres
                .distinct() // Remove caracteres duplicados
                .sorted() // Ordena alfabeticamente
                .peek(System.out::println) // Mostra os elementos após a ordenação
                .limit(10) // Limita a 10 elementos
                .skip(2) // Pula os dois primeiros elementos
                .collect(Collectors.toList()); // Coleta em uma lista (operação terminal)

        // Exemplo de operações terminais adicionais
        long count = words.stream().count(); // Conta elementos
        boolean allMatch = words.stream().allMatch(s -> s.length() > 2); // Verifica se todos têm mais de 2 caracteres
        boolean anyMatch = words.stream().anyMatch(s -> s.startsWith("A")); // Verifica se algum começa com 'A'
        boolean noneMatch = words.stream().noneMatch(s -> s.endsWith("Z")); // Verifica se nenhum termina com 'Z'
        Optional<String> first = words.stream().findFirst(); // Obtém o primeiro elemento
        Optional<String> any = words.parallelStream().findAny(); // Obtém qualquer elemento (útil em paralelo)
        Optional<String> max = words.stream().max(Comparator.comparingInt(String::length)); // Palavra mais longa
        Optional<String> min = words.stream().min(Comparator.comparingInt(String::length)); // Palavra mais curta
        String reduced = words.stream().reduce("", (a, b) -> a + " " + b); // Reduz para uma única string
        Map<Integer, List<String>> groupedByLength = words.stream().collect(Collectors.groupingBy(String::length)); // Agrupa por tamanho
        IntSummaryStatistics stats = words.stream().collect(Collectors.summarizingInt(String::length)); // Estatísticas dos tamanhos

        // Imprimindo os resultados
        System.out.println("Lista Final: " + result);
        System.out.println("Quantidade de elementos: " + count);
        System.out.println("Todos têm mais de 2 caracteres? " + allMatch);
        System.out.println("Algum começa com 'A'? " + anyMatch);
        System.out.println("Nenhum termina com 'Z'? " + noneMatch);
        System.out.println("Primeiro elemento: " + first.orElse("Nenhum"));
        System.out.println("Qualquer elemento: " + any.orElse("Nenhum"));
        System.out.println("Maior palavra: " + max.orElse("Nenhuma"));
        System.out.println("Menor palavra: " + min.orElse("Nenhuma"));
        System.out.println("Redução: " + reduced);
        System.out.println("Agrupado por tamanho: " + groupedByLength);
        System.out.println("Estatísticas: " + stats);
    }
}
