/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasemath;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class ClaseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Math.sqrt;  con esta clase puedes sacar la raiz cuadrada de un numero
        
        double raiz = Math.sqrt(9);
        /* como resultado dara un un numero decimal "double" para cambiarlo a entero
        escribimos int raiz = (int)Math.sqrt(9);
        */
        System.out.println("Math.sqrt --> raiz cuadrada "+raiz);
        
        // Elevacion de un numero en portencia con Math.pow
        
        double base = 5, exponente = 2;
        double resultado = Math.pow(base, exponente);
        System.out.println("Math.pow --> exponente "+resultado);
        
        // Math.round este metodo se usa para redondear un numero
        
        /* Aca declaramos una variable DOUBLE como resultutado sera un numero entero
        Por lo cual se coloca  long, todo numero de tipo double se redondea a un tipo de dato entero */
        double numero = 5.67;
        long r = Math.round(numero);
        System.out.println(r);
        
        /* declaramos una variable tipo decimal "float" en este caso para redondear creamos una variable
        tipo entera para que almacene el numero a redondear, se usa una variable tipo entera "int".
        
        tener en cuenta que se pone f al final para confirmar que es una variable tipo decimal.
        */
        
        float n = 4.16f;
        int x = Math.round(n);
        System.out.println(x);
        
        // Math.ramdon con este metodo obtendremos un numero aleatorio
        
        double q = Math.random();//esta linea como resultado dara un numero decimal.
        JOptionPane.showMessageDialog(null, "Este el numero aleatorio"+q);
        // tambien  podemos generar numeros aleatorios tipo enteros y determinar un inicio y final ejem.
        int e = (int) (Math.random()*10+1);
        /*En este caso el número generado estará entre 1 y 10, por que primero lo multiplicamos por 10 
        con lo que tendríamos un número entre 0 y 9 y al sumarle 1 a este número tendremos finalmente
        un número entre 1 y 10.*/
        JOptionPane.showMessageDialog(null, e);
        
        
        
        
        
    }
    
}
