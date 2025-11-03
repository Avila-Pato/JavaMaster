/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javamaster;

/**
 *
 * @author pavil
 */
public class IntercambiarVariable {
     
//    el metodo no devuelve nada es de tipo void 

    public void intercambiar() {
        String x = "agua";
        String y = "Coca";
        String temp;

        temp = x;
        x = y;
        y = temp;
        
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
//     otra opcion para devolver el resultado es usando un return cuando el metodo es un String

//            public String intercambiar() {
//                
//            } 
//           return "x = " + x + ", y = " + y;
    }
}
