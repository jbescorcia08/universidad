/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadenas;

/**
 *
 * @author Sistemas
 */
public class ejercicios {

    public static void main(String[] args) {

        /* 
        
        Usando String.format 
        
        extructura:
        
        System.out.println(formato, valor);
        
         */
        // String 
        String nombre = "Jesus";
        String apellido = "barrios";

        String nombreCompleto = String.format("%s %s", nombre, apellido);
        System.out.println(nombreCompleto);

        // enteros
        String numeros = String.format("%d - %d - %d - %d", 23, 23, 43, 4);
        System.out.println(numeros);

        // float
        float valor = 1.232f;
        String flotante = String.format("%.1f - %.2f - %.3f -", valor, valor, valor);
        System.out.println(flotante);

        //double
        double nuDouble = 12.2334;
        double nu2Double = 2;
        String nuString = String.format("Precion: %d, Cantidad: %d", nuDouble, nu2Double);
        System.out.println(nuString);

        // boleano
        int numero = 5;
        boolean valorBooleano = 5 > numero;
        String resultado = String.format("El numero %d es mayor que %d ", valorBooleano, numero);
        System.out.println(resultado);

        //ordenado
        String uno = "Uno";
        String dos = "Dos";
        String tres = "Tres";

        System.out.printf("%3$s - %2$s - %1$s", uno, dos, tres);

        float pi = 3.14159265359f;

        String resultado1 = String.format("%1f - Decimales: %1$.2f", pi, pi);
        System.out.println(resultado1);
    }

}
