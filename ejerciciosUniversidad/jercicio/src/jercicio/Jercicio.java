/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class Jercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // String 
        String cadena = "Anita lava la tina", cade2 = "Paulito saca un clavo"; 
        
        //cadena = JOptionPane.showInputDialog("Digite frase");
        // el .length sirve para saber la cantidad de caracteres que tiene una cadena.
        System.out.println("La frase tiene "+cadena.length()+" caracteres");
        //.chartAt(6) nostrae un caracter y el parametro 6 es el numero de caracter en la cadena
        System.out.println("El caracter es "+cadena.charAt(6));
        // .substring(6, 11) nostrae una cadena segun el parametro que elijamos --> (6, 11)
        System.out.println("El substring es "+cadena.substring(6, 11));
        //.concat une una frase al estremo ubicando otra cadena como parametro
        System.out.println("Las frases concatenadas son \n " + "  "+cadena.concat(cade2));
        // .indexOf da la pocicion de lapalabra
        System.out.println("Donde esta lava? "+cadena.indexOf("lava"));
        /*
        Pasar de mayusculas a minusculas con .toUpperCase & toLOwerCase
        */
        System.out.println("cadenas a mayusculas "+cadena.toUpperCase());
        System.out.println("cadenas en mayusculas "+cadena.toLowerCase());
        // .trim elimina los espacion de una cadena
        System.out.println("La cadena sin espacios es "+cade2.trim());
        // .replace remplaza una cadena en especifica por otra.
        System.out.println("Lacena de esta"+cadena.replace("lava","compra"));
    }
    
}
