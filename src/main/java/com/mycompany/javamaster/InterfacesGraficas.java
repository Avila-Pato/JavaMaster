
package com.mycompany.javamaster;
import javax.swing.JOptionPane;


public class InterfacesGraficas {
       
    public void interfaz(){
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre ");
        JOptionPane.showMessageDialog(null, "Hola " + nombre);
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("iNGRESE SU EDAD: "));
        JOptionPane.showMessageDialog(null,"tienes " + edad + " de edad ");
        
        
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura "));
        JOptionPane.showMessageDialog(null, "Tu altura es de " + altura + "cmt");
        
        
    }
    
}
