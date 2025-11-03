

package com.mycompany.javamaster;
import java.util.Scanner;
    
public class EntradasDatos {
    
    public String entradaDeDatos() {
        
        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Cual es tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Cuantos anos tienes: ");
        String age = scanner.nextLine();
        
        
         return "Hola " + nombre + " tu edad es " + age;
        
//        System.out.println("Hola" + nombre);
//        System.out.println("Tienes "+ age + "de anos");
        
    }
    
}
