/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        la calificacion final de un estudiante de informatica con base de las calificasiones de cuatro
        aspectos de su rendimiento academico; participacion, primer examen parcial segundo examen parcial
        y examen final. sabiendo que las calificacion final con operaciones del 10% 25% 25% y 40% hacer un programa que calcule e imprima
        la calificasion final obtenida por un estudiante.
        */
        
        // declaramos la clase scanner
        Scanner entrada = new Scanner(System.in);
        // declaramos las variables, elegir el tipo de variable correspondiente al tipo de datos ahorramos recurso en nuestro equipo
        float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;
        //pedimos las notas
        System.out.println("Ingresa la nota de participacion ");
        participacion = entrada.nextFloat();
        System.out.println("Ingresa la nota del primer examen ");
        primerExamen = entrada.nextFloat();
        System.out.println("Ingresa la nota del segundo examen ");
        segundoExamen = entrada.nextFloat();
        System.out.println("Ingresa la nota del examen final ");
        examenFinal = entrada.nextFloat();
        //sacmos el porcentaje de las notas
        participacion *= 0.10;
        primerExamen *= 0.25;
        segundoExamen *= 0.25;
        examenFinal *= 0.40;
        // suma de las todas las nots
        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
        //resultado impreso
        System.out.println("La nota final es de "+notaFinal);
        
    }
    
}
