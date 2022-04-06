/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Guillermo tiene N dolares.
        Luis tiene la mitad de lo que posee Guillermo.
        Juan tiene la mitad de lo que posee Luis y Guillermo juntos.
        Hacer un programa que calcule e imprima la cantidad de dinero que 
        tienen los tres.
        */
        Scanner entrada = new Scanner(System.in);
        
        double guillermo, luis, juan, total;
        
        System.out.println("Digite la cantidad que tiene Guillermo");
        guillermo = entrada.nextDouble();
        
        luis = guillermo / 2;
        juan = (guillermo+luis) / 2;
        
        total = guillermo+luis+juan;
        System.out.println("\nLa cantida total de dinero que tienen los tres es de "+total);
        
    }
    
}
