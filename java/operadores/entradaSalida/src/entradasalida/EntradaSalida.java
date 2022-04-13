/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradasalida;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sistemas
 */
public class EntradaSalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // entrada y salida de datos desde la CONSOLA.
        Scanner entrada = new Scanner(System.in);/*
        Scanner es una clase en el paquete java.util utilizada para obtener la entrada de los tipos primitivos
        como int, double etc. y también String. Es la forma más fácil de leer datos en un programa Java, 
        aunque no es muy eficiente si se quiere un método de entrada para escenarios donde el tiempo es una 
        restricción, como en la programación competitiva.
        */
        
        // Entrada de tipo de Dato int. --> entera
        
        int entero; 
        System.out.println("Digita un numero; ");
        entero = entrada.nextInt(); // de esta manera obtiene el dato ingresado por el usuario de tipo entero.
        System.out.println("Este es el numero; "+entero);
        
        // entrada de tipo de Dato float. --> decimal
        
        float decimal;
        System.out.println("Ingresa un numero decimall; ");
        decimal = entrada.nextFloat();
        System.out.println("este es un decimal; "+decimal);
        
        //Entrada de tipo double --> decimal y entero
        
        double numeros;
        System.out.println("ingresa numeros");
        numeros = entrada.nextDouble();
        System.out.println("Este es tu numero; "+numeros);
        
        // estrada tipo String --> tipo de datos de cadena de texto.
        String cadena;
        System.out.println("Digite una cadena de texto");
        //cadena = entrada.next();// entrada.next(); solo guarda el texto hasta el ESPACIO mas cercano
        cadena = entrada.nextLine();//entrada.nextLine(); guarda una cadena completa de texto.
        System.out.println("Esta es una cadena de texto; "+cadena);
        
        // tipo de datos CHAR --> guarda una sola letra.
        char letra;
        System.out.println("Ingresa una letra");
        letra = entrada.next().charAt(0);
        System.out.println("Esta es la letra "+letra);
        
        
        
        

        
        
    }
    
}
