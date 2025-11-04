
package com.mycompany.javamaster;


public class JavaMaster {

    public static void main(String[] args) {
//  EJERCICIO1 LALMADA TIPO VOID
//      IntercambiarVariable ejercicio1 = new IntercambiarVariable();
//      ejercicio1.intercambiar();
//  EJERCICIO2 LLAMADA TIPO STRING
//      EntradasDatos entrada = new EntradasDatos();
//        System.out.println(entrada.entradaDeDatos() );
//  EXPRESIONES ARITMETICAS LLAMDA TIPO STRING
//       ExpresionesAritmeticas expresiones = new  ExpresionesAritmeticas();
//        System.out.println(expresiones.expresionesAritmeticas());
//  INTERFACES GRAFICAS sin JFRAM  
//        InterfacesGraficas ventana = new InterfacesGraficas();
//        ventana.interfaz();
//  OPERACIONES MATIMATICAS CON MATH // !!TIPO STRING POR ESO LA LLAMADA SE LLAMA POR CONSOLA
        OperacionesMath Math = new OperacionesMath();
        System.out.println("LLamada Math \n" + Math.MathOperations());

    }
}
