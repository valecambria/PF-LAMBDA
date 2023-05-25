package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
//Un function como expresion lambda, recibe un argumento y ademas devuelve un valor, es una mezcla entre el consumidor y el supplier
        //El primer argumento es el tipo que recibe, y el segundo es el tipo que devuelve
        Function<String, String> f1 = param -> "Hola que tal " + param;
        String resultado = f1.apply("amigo");
        System.out.println(resultado);

        Function<String, String> f2 = String::toUpperCase;
        String resultado2 = f2.apply("hola como estas");
        System.out.println(resultado2);

        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        String resultado3 = f3.apply("hola,", "todo bien?");
        System.out.println(resultado3);

        BiFunction<String, String, Integer> f4 = String::compareTo; //(a, b) -> a.compareTo(b);
        System.out.println(f4.apply("juan", "juan"));

    }
}
