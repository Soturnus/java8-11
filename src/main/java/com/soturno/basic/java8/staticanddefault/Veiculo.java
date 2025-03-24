package com.soturno.basic.java8.staticanddefault;

interface Veiculo {

    void acelerar(); // Método abstrato

    default void buzinar() { // Método default com implementação
        System.out.println("Buzina padrão: BEEP BEEP!");
    }

    default void emplacar(){
        System.out.println("Metodo nao implementado!");
    }

    static void mostrarInfo() {
        System.out.println("Essa é uma interface utilitária, e pode realizar alguma função generica em comum a todas implementações");
    }
}
