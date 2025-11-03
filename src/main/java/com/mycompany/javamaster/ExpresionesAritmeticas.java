package com.mycompany.javamaster;

public class ExpresionesAritmeticas {

    // Constructor (opcional)
    public ExpresionesAritmeticas() {
    }

    public String expresionesAritmeticas() {

        int valorInicial = 10;
        int resultado = 0;

        // Llamada a la función IncrementarUno
        resultado = valorInicial + incrementarUno();
        System.out.println("Resultado después de incrementar: " + resultado);

        // Tipos de datos
        int a = 10;
        int b = 5;

        double c = 3.4;
        double d = 2.3;

        // Operadores aritméticos
        int suma = a + b;
        int resta = a - b;
        int multi = a * b;

        // Prevención de división por cero
        int division = (b != 0) ? (a / b) : 0;

        double sumaDouble = c + d;
        int modulo = a % b;
        int combinados = (a + b) * (a - b) / b;

        // Bloque try-catch (aquí no tiene sentido porque no hay error dentro)
        try {
            int adicionales = a / b;
            System.out.println("Resultado adicional: " + adicionales);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        }

        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multi);
        System.out.println("División: " + division);
        System.out.println("Suma de dobles: " + sumaDouble);
        System.out.println("Módulo: " + modulo);
        System.out.println("Combinado: " + combinados);

        return "Operaciones realizadas correctamente.";
    }

    // Método estático para incrementar
    public static int incrementarUno() {
        return 1;
    }

}
