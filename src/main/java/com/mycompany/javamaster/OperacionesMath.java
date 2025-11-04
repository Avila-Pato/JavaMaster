/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javamaster;


public class OperacionesMath {
    
    public String MathOperations() {
        
        double x = 3.14;
        int y = 10;
        
//        Mayor y menor
        double z =  Math.max(x, y); // Encuentra el mayor
        double m = Math.min(x, y); // Encuentra el menor

//        POTENCIANDO RAIZ CUADRADA
        double a = Math.pow(x, y); // Eleva a a la potencia de b
        double s = Math.sqrt(y); // raiz cuadara de y
        
//        Redondeo 
        
        double r = Math.round(3.6); // redondea al mas cercano 4
        double f = Math.floor(3.9); // redondea hacia abajo 3.0
        double c = Math.ceil(3.1); // Redondea hacia abajo
        
//        para valores absolutos
        double b = Math.abs(-43.52);
        
//        Para numeros aleatorios con decimales
         double n = Math.random();

//      NUMEROS ALEATORIOS SIN DECIMALES
        
        int w = (int)(Math.random() * 100) + 1;
        
         
         
         return  "Resultados de operaciones Math:\n" +
                "---------------------------------\n" +
                "Mayor: " + z + "\n" +
                "Menor: " + m + "\n" +
                "Potencia (x^y): " + a + "\n" +
                "Raíz cuadrada de y: " + s + "\n" +
                "Redondeo (round 3.6): " + r + "\n" +
                "Redondeo hacia abajo (floor 3.9): " + f + "\n" +
                "Redondeo hacia arriba (ceil 3.1): " + c + "\n" +
                "Valor absoluto (-43.52): " + b + "\n" +
                "Número aleatorio con decimales (0.0–1.0): "  + n + "\n" +
                "Numero aleotrio sin decimales " + w 
                 ;
        
    }
    
}
