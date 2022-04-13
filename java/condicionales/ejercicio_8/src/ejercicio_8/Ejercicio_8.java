/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_8;

import javax.swing.JOptionPane;

/**
 *
 * @author Sistemas
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pedir un numero entre 0 y 99 999 y decir cuantas cifras tiene
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero !!"));
        
        if (numero<=9){
            JOptionPane.showMessageDialog(null, "EL numero tiene una cifra;");
        }else if (numero<=99){
            JOptionPane.showMessageDialog(null, "El numero tiene dos cifras");
        }else if (numero<=999){
            JOptionPane.showMessageDialog(null, "El numero tiene tres cifras");
        }else if (numero<=9999){
            JOptionPane.showMessageDialog(null, "El numero tiene cuatro cifras");
        }else if (numero<=99999){
            JOptionPane.showMessageDialog(null, "El numero tiene cinco cifras");
        }else{
            JOptionPane.showMessageDialog(null, "El numero tiene 6 o mas cifras");
        }
                
                
        
    }
    
}
