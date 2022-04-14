/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_13;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Hacer un programa que pase de Kg a otra unidad de medida de masa, mostrar en 
        pantalla un menu con las opciones posibles.
        */
        
        int operacion, kg;
        float   hectogramo, decagramo, gramo;
            
        operacion = Integer.parseInt(JOptionPane.showInputDialog("1. Kilogramo a Hectogramo\n"
                +"2. Kilogramo a Decagramo\n"
                +"3. Kilogramo a gramo"));
        
        switch(operacion){
            case 1: kg = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad en KILOGRAMOS"));
                                 hectogramo = kg * 10;
                                 JOptionPane.showMessageDialog(null, "KILOGRAMOS A HECTOGRAMO; "+hectogramo);
                                 break;
            case 2: kg = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad en KILOGRAMOS"));
                                 decagramo = kg * 100;
                                 JOptionPane.showMessageDialog(null, "KILOGRAMOS A HECTOGRAMO; "+decagramo);
                                 break;
            case 3: kg = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad en KILOGRAMOS"));
                                 gramo = kg * 1000;
                                 JOptionPane.showMessageDialog(null, "KILOGRAMO A GRAMO"+gramo);
                                 break;
            default: JOptionPane.showMessageDialog(null, "Verifica y ingresa el valor adecuado");                     
                                 
        }
        
        
    }
    
}
