/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadormayor;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class OperadorMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // condicional IF con operador >
        
        int numero, dato =5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
        
        // este es el operador mayor que ">"
        
        if(numero > dato){
            JOptionPane.showMessageDialog(null, "El numero si es mayo que 5");
        }else{
            JOptionPane.showMessageDialog(null, "Tu numero no es mayor que 5");
        }
    }
    
}
