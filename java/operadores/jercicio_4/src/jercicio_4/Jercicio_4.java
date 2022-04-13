/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jercicio_4;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Jercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Una compañia de venta de carros usados , paga a su personal de ventas una salario de $1000 mensuales, mas una comision de $150 por cada carro
        vendido, mas el 5% del valor  de la venta por carro. cada mes el capturista de la empresa ingresa en la computadora los datos
        pertinentes.
        
        Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
        */
        
        Scanner entrada = new Scanner(System.in);
        
        final int salario = 1000;
        int ventaCarro, costoCarro, comision, total;
        
        System.out.println("Tu salario es de "+salario);
        System.out.println("Ingresa el numero de carros vendidos");
        ventaCarro = entrada.nextInt();
        System.out.println("Ingresa el valor del carro en $ ");
        costoCarro = entrada.nextInt();
        
        ventaCarro *= 150;
        comision = (5*costoCarro)/100;
        
        total = salario+ventaCarro+comision;
        
        System.out.println("El salario mensual es de; "+total);
        
    }
    
}
