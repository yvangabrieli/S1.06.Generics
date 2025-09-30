package ejercicio2;

import java.io.IOException;
import java.util.Scanner;

public class GenericMethods {

    public static <T, V, X> void toPrintAll(T name, V surname, X edad) {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(edad);

    }
}
