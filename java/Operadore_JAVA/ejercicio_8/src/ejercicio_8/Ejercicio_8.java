/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Construir un programa que calcule y muestre por pantalla las raices de la ecuacion 
        de segundo grado de coeficientes reales        
        */
        Scanner entrada = new Scanner(System.in);
        double a, x, b, c;
        
        System.out.println("Ingresa el valor de A ");
        a = entrada.nextDouble();
        System.out.println("Ingresa el valor de B ");
        b = entrada.nextDouble();
        System.out.println("Ingresa el valor de C ");
        c = entrada.nextDouble();
        
        x = (-b)-Math.sqrt(Math.pow(b, 2)-4*a*c)/2*a;
        
        System.out.println("Este es el resultado de la primera ecuacion "+x);
        
        
        
        
    }
    
}
