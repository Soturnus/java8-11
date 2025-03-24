package com.soturno.basic.java8.lambda.personalizada;

import java.util.function.Function;

public class ProductProcessor {

    public static <T, R> R process(T product, Function<T, R> function) {
        return function.apply(product);
    }

}

//@FunctionalInterface
//public interface ProductProcessor<T, R> {
//    R processProduct(T product);
//
//    static <T, R> R process(T product, Function<T, R> function) {
//        return function.apply(product);
//    }
//}