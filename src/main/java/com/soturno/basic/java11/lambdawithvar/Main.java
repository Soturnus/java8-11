package com.soturno.basic.java11.lambdawithvar;

import org.jetbrains.annotations.NotNull;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        //Antes Java 11
        BiFunction<Integer, Integer, Integer> soma = (a, b) -> a + b;

        //Depois do Java11
        BiFunction<Integer, Integer, Integer> somaJava11 = (var a, var b) -> a + b;

        /************************************************************************************/

        //Antes Java 11
        Function<String, String> maiuscula = (@NotNull String s) -> s.toUpperCase();


        //Depois do Java11
        Function<String, String> maiusculajava11 = (@NotNull var s) -> s.toUpperCase();






    }

}
