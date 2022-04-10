/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradasalidajoptionpane_grafica;

import javax.swing.JOptionPane;

/**
 *
 * @author Sistemas
 */
public class EntradaSalidaJOptionPane_Grafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                // entrada y salida de datos manera grafica.
        
        String texto;
        int number;
        double decmal;
        char Cadena;
        
        texto = JOptionPane.showInputDialog("digite una cadena; ");
        number = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));
        decmal = Double.parseDouble(JOptionPane.showInputDialog("Dijite un numero decimal"));
        Cadena = JOptionPane.showInputDialog("Digita un caracter, ").charAt(0);
        
        JOptionPane.showMessageDialog(null, "Esta es una cadena; "+texto+"\nEste es un entero; "+number+"\nEste es un decimal; "+decmal+"\neste es un caracter; "+Cadena);
    }
    
}
