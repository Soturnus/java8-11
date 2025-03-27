package com.soturno.basic.java11.metodosutilitarios;

public class StringExamples {

    public static void main(String[] args) {

        String texto = "  Treinamento Java Março 2025  ";
        System.out.println();
        System.out.println("Removendo espaços antes de depois:" + texto.strip());
        System.out.println();
        System.out.println("Removendo espaços no inicio:" + texto.stripLeading());
        System.out.println();
        System.out.println("Removendo espaços no fim:" + texto.stripTrailing());
        System.out.println();
        System.out.println("Verificando se o conteudo esta vazio: " + "   ".isBlank());
        System.out.println();
        String multiLinha = "1. Primeira linha\n2. Segunda Linha";
        multiLinha.lines().forEach(System.out::println);
        System.out.println();
        System.out.println("Repetindo a String n vezes:" + "Po ".repeat(3));
    }
}
