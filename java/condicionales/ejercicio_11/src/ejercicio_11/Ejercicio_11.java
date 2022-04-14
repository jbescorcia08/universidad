/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_11;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        pedir una nota de 0 a 10 y mostrara de la forma insuficiente, bien, notable y sobresaliente.
        */
        
        int nota;
        
        nota = Integer.parseInt(JOptionPane.showInputDialog("Digita tu nota"));
        
        switch(nota){
            case 1:
            case 2:
            case 3:
            case 4:
                 JOptionPane.showMessageDialog(null, "Su nota es insuficiente");
                 break;
            case 5:
            case 6:
                 JOptionPane.showMessageDialog(null, "Su nota es Bien");
                 break;
            case 7:
            case 8:
                 JOptionPane.showMessageDialog(null, "Su nota es Notable");
                 break;
            case 9:
            case 10:    
                 JOptionPane.showMessageDialog(null,"Su nota es sobresaliente");
                 break;
            default: JOptionPane.showMessageDialog(null, "LA nota ingresada no cumple con el valor extablecido");     
        }
        
        
    }
    
}
