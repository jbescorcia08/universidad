/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Hacer un programa que calcule el cuadrado de una suma
        
        (a+b)**2 = a**2 + b**2 +2ab
        
        */
        // se declara el metodo Scanner
        Scanner entrada = new Scanner(System.in);
        // declaramos las varables
        int a, b;
        double c;
        //pedimos los datos  de las variables
        System.out.println("Ingrese el valor de A ");
        a = entrada.nextInt();
        System.out.println("Ingrese el valor de B ");
        b = entrada.nextInt();
        //expresamos la expresion
        c = Math.pow(a,2)+Math.pow(b, 2)+ Math.pow(a, 2) + Math.pow(b,2) +2*a*b;
        //imprimimos el resultado
        System.out.println("Este es el resultado de la operacion "+c);
        
        
    }
    
}
