package com.soturno.basic.java11.httpclient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Http2MultiplexingExample {

    public static void main(String[] args) {
        // Criando um HttpClient com suporte a HTTP/2
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        // Criando múltiplas requisições
        List<HttpRequest> requests = List.of(
                HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts/1")).build(),
                HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts/2")).build(),
                HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts/3")).build()
        );

        // Enviando todas as requisições de forma assíncrona e coletando as respostas
        List<CompletableFuture<HttpResponse<String>>> futures = requests.stream()
                .map(request -> client.sendAsync(request, HttpResponse.BodyHandlers.ofString()))
                .collect(Collectors.toList());

        // Bloqueia a execução até que todas as requisições sejam concluídas e coleta os resultados
        List<HttpResponse<String>> responses = futures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        // Exibe todas as respostas no final
        responses.forEach(response -> {
            System.out.println("Response from: " + response.uri());
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Body: " + response.body());
        });
    }
}
