package com.soturno.basic.java11.metodosutilitarios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesExample {

    public static void main(String[] args) throws IOException {
        Path caminho = Path.of("relatorioTreinamento.txt");

        Files.writeString(caminho, "Aqui estou escrevendo um detalhamento de um relatorio criado no treinamento \nJava > PHP \nMuito mais facil assim!!!");

        String conteudo = Files.readString(caminho);
        System.out.println(conteudo);
    }
}
