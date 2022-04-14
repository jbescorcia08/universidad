/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_10;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Construir un programa que simule el funcionamiento de una calculadora que puede realizar
        las cuatro operaciones matematicas basicas "suma, resta, multiplicasion, y division" con valores numericos enteros.
        el usuario debe especificar la operacion con el primer caracter de primer parametro de la linea de comandos;
        S para suma , r para resta, p multiplicasion y d para division
        */
        
        int numero1, numero2, suma, resta, mult, div;
        char operacion ;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo numero"));
        
        operacion = JOptionPane.showInputDialog("Digite la operacion que desea usar; ").charAt(0);
        
        switch(operacion){
            case 's':
            case 'S': suma = numero1 +numero2;
                      JOptionPane.showMessageDialog(null, "El resultado de la suma es de; "+suma);
                      break;
            case 'r': 
            case 'R': resta = numero1 - numero2;
                      JOptionPane.showMessageDialog(null, "El resultado de la suma es de; "+resta);
                      break;
            case 'P':
            case 'p':
            case 'M':
            case 'm': mult = numero1 * numero2;
                      JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es de; "+mult);
                      break;
            case 'd':
            case 'D': div = numero1 / numero2;
                      JOptionPane.showMessageDialog(null,"El resultado de la division es de; "+div);
                      break;
            default: JOptionPane.showMessageDialog(null, "NO selecciono la operacion corecta, verifica y vuelve a ejecutar");          
                
        }
        
    }
    
}
