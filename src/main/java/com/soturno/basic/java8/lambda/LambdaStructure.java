//package com.soturno.basic.java8.lambda;
//
//public class LambdaStructure {
//
//    /* Função inicial para somar  */
//    private void sum(int i, int j){
//        System.out.println(i+j);
//    }
//
//    //TODO: Primeiro removemos o modificador de acesso
//    void sum(int i, int j){
//        System.out.println(i+j);
//    }
//
//    //TODO: em seguida removemos o tipo de retorno
//    sum(int i, int j){
//        System.out.println(i+j);
//    }
//
//    //TODO: Também removeremos o nome do metodo
//    (int i, int j){
//        System.out.println(i+j);
//    }
//
//    //TODO: Agora vamos inserir o token que representa uma função anonima "->"
//    (int i, int j) -> {
//        System.out.println(i+j);
//    }
//
//    //TODO: Como a nossa linguagem já é capaz de indentificar o tipo de cada parametro dinamicamente também podemos remover
//    (i, j) -> { System.out.println(i+j);}
//
//    //TODO: e por ser uma expressão simples também podemos remover as caracteristicas do bloco de implementação ficando assim
//    (i, j) -> System.out.println(i+j);
//
//
//    //TIPOS DE LAMBDA
//
//    // SEM ARGUMENTOS
//    () -> System.out.println("Lambda")
//
//    // UM ARGUMENTO
//    (s) -> System.out.println(s)
//
//    //DOIS ARGUMENTOS
//    (x, y) -> x + y
//
//    //MULTIPLAS DECLARAÇÕES
//    (x, y) -> {
//        System.out.println(x);
//        System.out.println(y);
//        return x + y;
//    }
//
//
//
//}
