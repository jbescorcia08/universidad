/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Pedir dos numeros y decir cual es el mayor o si son iguales.
        */
        
        int numero1, numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo numero "));
        
        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null, "El primer numero "+numero1+" es mayor que "+numero2);
        }else if(numero1<numero2){
            JOptionPane.showMessageDialog(null, "El segundo numero "+numero2+" es menor que primer numero "+numero1);
        }else{
            JOptionPane.showMessageDialog(null, "El primer numero "+numero1+" es igual al segundo numero "+numero2);
        }
        
        
    }
    
}
