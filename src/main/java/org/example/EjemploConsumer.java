package org.example;

import org.example.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {
//Los consumers no devuelven nada solamente realizan algun trabajo que le indiquemos
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
            System.out.println(f.format(fecha));
        };
        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> {
            System.out.println(nombre + " tiene " + edad + " años");
        };
        consumidorBi.accept("pepe", 20);

        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola mundo lambda");

        List<String> nombres = Arrays.asList("Juan", "Pedro", "Matias", "Lara");
        nombres.forEach(consumidor2);

        Supplier<Usuario> creaUsuario = Usuario::new;
        Usuario usuario = creaUsuario.get();

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario ,"Andres");
        System.out.println("Nombre usuario: " + usuario.getNombre());

        Supplier<String> proveedor = () -> "Hola mundo lambda supplier";

        System.out.println(proveedor.get());

    }
}