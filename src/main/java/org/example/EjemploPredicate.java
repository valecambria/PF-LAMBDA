package org.example;

import org.example.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> test = num -> num > 10;
        boolean r = test.test(20);
        System.out.println(r);

        Predicate<String> t2 = rol -> rol.equals("ROLE_ADMIN");
        System.out.println(t2.test("ROLE_ADMIN"));

        BiPredicate<String, String> t3 = String::equals;
        System.out.println(t3.test("hola", "hoa"));

        BiPredicate<Integer, Integer> t4 = (i, j) -> j > i;
        boolean r4 = t4.test(9, 10);
        System.out.println(r4);

        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("Juan");
        b.setNombre("Juan");
        BiPredicate<Usuario, Usuario> t5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println(t5.test(a,b));
    }
}
