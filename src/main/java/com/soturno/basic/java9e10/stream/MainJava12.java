package com.soturno.basic.java9e10.stream;

import java.util.List;
import java.util.stream.Collectors;

public class MainJava12 {

    public static void main(String[] args) {

        record Estatisticas(int soma, double media) {}

        var estatisticas = List.of(1, 2, 3, 4, 5).stream()
                .collect(Collectors.teeing(
                        Collectors.summingInt(n -> n),
                        Collectors.averagingInt(n -> n),
                        Estatisticas::new
                ));

        System.out.println(estatisticas);

    }


}
