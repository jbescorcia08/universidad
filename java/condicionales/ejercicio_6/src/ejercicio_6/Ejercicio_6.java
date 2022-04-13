/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Sistemas
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
        hacer un programa que tome dos numeros y diga si ambos son pares o impres
        */
        
        int numero1, numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingre el primer numero "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero "));
        
        if (numero1 % 2 == 0){
            JOptionPane.showMessageDialog(null, " el primer numero ingresado es PAR");
        }else{
            JOptionPane.showMessageDialog(null, "EL primer numero no es PAR");
        }
        if (numero2 % 2 == 0){
            JOptionPane.showMessageDialog(null, " el segundo numero ingresado es PAR");
        }else{
            JOptionPane.showMessageDialog(null, "EL segundo numero no es PAR");
        }    
    }
    
}
