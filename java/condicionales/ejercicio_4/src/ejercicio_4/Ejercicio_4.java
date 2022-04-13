/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        En megaplaza se hace un 20% de descuento a los clientes cuya compra supere los 300.
        ¿cual sera la cantidad que pagara una persona por su compra?
        */
        
        double compra;
        
        compra = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de la compra; "));
        
        if(compra >= 300){
            compra = (300*0.2);
            JOptionPane.showMessageDialog(null, "El valor a pagar es de "+compra);
        }else{
            JOptionPane.showMessageDialog(null, "No aplica para compra :(");
        }
    }
    
}
