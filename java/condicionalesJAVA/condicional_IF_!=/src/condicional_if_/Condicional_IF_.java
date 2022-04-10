/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicional_if_;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class Condicional_IF_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // condicional if !=
        int numero, dato=5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        /*
        Los signos != se usan para declarar si un varlo es diferente del otro en este caso diria que numero es distino de dato.
        */
        if(numero != dato){
            JOptionPane.showMessageDialog(null, "EL numero es diferente que dato");
        }else{
            JOptionPane.showMessageDialog(null, "El numero si es igual a dato");
        }
    }
    
}
