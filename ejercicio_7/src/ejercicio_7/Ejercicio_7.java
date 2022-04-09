/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Construir un programa que, dado  un numero total de horas, devuelve el numero de semanas
        dias  y horas equivalentes. por ejemplo, dado un total de 1000 horas debe mostrar, 6 dias y 16 horas.
        */
        // declaramos la clase scanner para pedir los datos por consola
        Scanner entrada = new Scanner(System.in);
        //declaracion de variables
        int horasTotal, semanas, dias, horas;
        //pedimos la cantidad de horas
        System.out.println("Ingresa la cantidad de horas ");
        horasTotal = entrada.nextInt();
        //realizamos la operacion
        semanas = horasTotal / 168;
        dias = horasTotal % 168 / 24;
        horas = horasTotal % 24;
        //imprimimos el resultado
        System.out.println("\nEl equivalente es "+"\nSemanas "+semanas+"\ndias "+dias+"\nhoras "+horas);
    }
    
}
