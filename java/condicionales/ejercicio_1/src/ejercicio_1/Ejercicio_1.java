/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10.
        */
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero; "));
        // % --> modulo, se usa para saber si un numero es par o si tiene residuo durante la operacion.
        if(numero%10 == 0){
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es multiplo de 10 ");
        }else{
            JOptionPane.showMessageDialog(null, "El numero no es multiplo de 10 ");
        }
        
    }
    
}
