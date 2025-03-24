package com.soturno.basic.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithoutLambda {

    public static void main(String[] args) {

        List<Integer> valores = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> dobro = new ArrayList<>();
        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();


        for (Integer valor : valores){
            dobro.add(valor*2);
        }
        for (Integer valor : valores){
            if(valor%2 == 0){
                par.add(valor);
            } else {
                impar.add(valor);
            }
        }

        System.out.println("Originais: " + valores);
        System.out.println("    Dobro: " + dobro);
        System.out.println("    Pares: " + par);
        System.out.println("  Impares: " + impar);

    }
}
