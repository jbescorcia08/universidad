/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // operadores + - * /
        Scanner entrada = new Scanner(System.in);
        float numero1, numero2, suma, resta, mult, div, rest;
        
        System.out.println("Ingresa un numero");
        numero1 = entrada.nextFloat();
        System.out.println("Digita otro numero");
        numero2 = entrada.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        rest = numero1 % numero2;
        
        System.out.println("Este es el resultado de la suma "+suma);
        System.out.println("Este es el resultado de la resta "+resta);
        System.out.println("Este es el resultado de la multiplicasion "+mult);
        System.out.println("Este es el resultado de la Division");
        System.out.println("Este es el resultado de mod "+rest);
    }
    
}
