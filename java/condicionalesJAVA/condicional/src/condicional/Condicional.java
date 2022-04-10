/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicional;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class Condicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // sentencia if con ==
        int numero, dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        /* 
        un solo signo = se usa para la asignacion de un valor y == se usa para comparar un valor con otro.
        */
        if(numero == dato){
            JOptionPane.showMessageDialog(null, "El numero es igual a DATO");
        }else{
            JOptionPane.showMessageDialog(null, "El numero no es igual a dato");
        }
    }
    
}
