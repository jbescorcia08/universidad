/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* realice un algoritmo que solicite al usuario ingresar una clave, debe validar
        que contenga.
        1. Que La longitud sea mayor de 8 caracteres
        2. Contenga menos, 1 mayuscula y un caracter especial.
        */
        
        
        String clave;
        
        clave = JOptionPane.showInputDialog("Ingresa la clave\n"
                + "REQUISITOS\n"
                + "La clave solo debe tener 8 caracteres o mayor a 8\n"
                + "Debe tener una mayuscula y un caracter especial");
        
        if (clave.length()>=8){
            if(clave.contains("!")||clave.contains("@")||clave.contains("#")||clave.contains("$")||clave.contains("%")||
               clave.contains("/")||clave.contains("(")||clave.contains(")")||clave.contains("=")||clave.contains("?")||
               clave.contains("¿")||clave.contains("*")||clave.contains("{")||clave.contains("}")||clave.contains("-")||
               clave.contains(".")||clave.contains(",")){
                if(clave.contains("Q")||clave.contains("W")||clave.contains("E")||clave.contains("R")||clave.contains("T")||
               clave.contains("O")||clave.contains("I")||clave.contains("U")||clave.contains("Y")||clave.contains("P")||
               clave.contains("S")||clave.contains("F")||clave.contains("G")||clave.contains("H")||clave.contains("A")||
               clave.contains("D")||clave.contains("J")||clave.contains("K")||clave.contains("L")||clave.contains("Ñ")||
               clave.contains("Z")||clave.contains("X")||clave.contains("C")||clave.contains("V")||clave.contains("B")||
               clave.contains("N")||clave.contains("M")){
                    if(clave.contains("q")||clave.contains("w")||clave.contains("e")||clave.contains("t")||clave.contains("y")||
               clave.contains("a")||clave.contains("p")||clave.contains("o")||clave.contains("i")||clave.contains("u")||
               clave.contains("s")||clave.contains("d")||clave.contains("f")||clave.contains("g")||clave.contains("h")||
               clave.contains("j")||clave.contains("k")||clave.contains("l")||clave.contains("ñ")||clave.contains("z")||clave.contains("x")||
               clave.contains("m")||clave.contains("n")||clave.contains("b")||clave.contains("v")||clave.contains("c")){
                        
                        JOptionPane.showMessageDialog(null, "Genial la clave cumple con los requerido !! clave; "+clave);
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "La clave no tiene letras minusculas");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "La clave no tiene Letras mayusculas");
                }
            }else{
                JOptionPane.showMessageDialog(null, "la clave no tiene un caracter especial");
            }
        }else{
            JOptionPane.showMessageDialog(null, "La clave no es igual o mayor a 8 caracteres, intenta de nuevo :)");
        }
        
        
    }
}  
        
    
    

