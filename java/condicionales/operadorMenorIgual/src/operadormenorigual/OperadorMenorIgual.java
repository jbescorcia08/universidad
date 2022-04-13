/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadormenorigual;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class OperadorMenorIgual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // este es el operador menor o igual "<="
        int numero, dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        if(numero <= dato){
            JOptionPane.showMessageDialog(null, "El numero si es menor o igual que 5");
        }else{
            JOptionPane.showMessageDialog(null, "Tu numero no es menor o igual que 5");
        }
    }   
}
