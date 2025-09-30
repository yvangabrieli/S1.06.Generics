package ejercicio2;

import javax.naming.Name;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona person = new Persona ("Joe", "Harry", 53);
        System.out.println(person);
        GenericMethods.toPrintAll( 'J', "Potter", 76);
        System.out.println();
        GenericMethods.toPrintAll("Anna","Kistrens" , 34.76);
    }
}
