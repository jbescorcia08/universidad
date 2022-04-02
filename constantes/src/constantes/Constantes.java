/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constantes;

/**
 *
 * @author Sistemas
 */
public class Constantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* constantes; es la asignacion de un valor que nunca cambiara 
        en el proceso. */
        final int numero = 19; // de esta forma se expresa una constante.
        //<--int numero 10; //este es un error si se intenta cambiar el valor asignado aun constante.
        System.out.println("este es una constante; "+numero);
        
        //variables.
        
        int variable = 13;/*
        el valor puede cambiar durante el proceso.
        */
        
        variable = 14;
        
        System.out.println("esta es una variable "+variable);
    }
    
}
