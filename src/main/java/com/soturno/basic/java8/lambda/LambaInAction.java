package com.soturno.basic.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class LambaInAction {

    public static void main(String[] args) {

        Integer num1 = 5;
        Integer num2 = 5;

        //TODO: Decompor e Simplificar
        // LEMBRANDO QUE BiFunction ficou disponivel na versão 11 do java.
        BiFunction<Integer, Integer, Integer> soma = (Integer a, Integer b) -> {
            return a + b;
        };

        System.out.println("Soma basica: " + soma.apply(num1, num2));

        /****************************************************************************/

//        List<Integer> valores = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> dobro = new ArrayList<>();
//        List<Integer> par = new ArrayList<>();
//        List<Integer> impar = new ArrayList<>();
//
//        valores.forEach((v) -> {
//            dobro.add(v*2);
//            if (v % 2 == 0) {
//                dobro.add(v);
//            } else {
//                impar.add(v);
//            }
//        });
//
//        System.out.println("Originais: " + valores);
//        System.out.println("    Dobro: " + dobro);
//        System.out.println("    Pares: " + par);
//        System.out.println("  Impares: " + impar);

        //            (v % 2 == 0 ? par : impar).add(v);

    }
}
