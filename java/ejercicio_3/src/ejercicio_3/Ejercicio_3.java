/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula.
        */
        
        char caracter;
        
        caracter = JOptionPane.showInputDialog(" Dijita una letra").charAt(0);
        // isUpperCase determina si un caracter es mayuscula
        if (Character.isUpperCase(caracter)){
            JOptionPane.showMessageDialog(null, "esta es una letra mayuscula ");
        }else{
            JOptionPane.showMessageDialog(null, "No es una letra mayuscula ");
        }
    }
    
}

