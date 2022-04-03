/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreincrementodecremento;

/**
 *
 * @author jesus
 */
public class OperadoreIncrementoDecremento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EL CODIGO ESTA COMENTADO PARA EXPLICAR EL USO DE ESTE EJERCICIO !!
        int x = 5, r = 5, y;
        // operador de incremento aumenta en uno el valor de la variable.
        //x++;// esta linea es igual a x+=1;
        //operados de decremento le resta uno al valor de la variable
       // r--;
        //System.out.println("resultado de X "+x+"\nresultado de R "+r);
        
        //Asignacion del valor de una variable  incremento.
        
        //y = x++; //SUFIJO
        /* en esta linea se le esta asignado el valor a y como resultado
        dara 5, esto pasa debido a que primero se le asiga el valor de x y despues 
        se asigna a x++ como resultado dara 6
        
        para que  pueda hacer el incremento se debe poner como prefijo o mejor dicho antes de x, ejem
        */
        y=++x;//PREFFIJO
        
        //decremento
        
        y=--x;
        
        System.out.println(y);
        System.out.println(x);
    }
    
}
