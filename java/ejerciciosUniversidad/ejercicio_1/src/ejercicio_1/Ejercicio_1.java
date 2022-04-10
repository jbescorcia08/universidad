/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* realice un algoritmo que solicite al usuario ingresar una clave, debe validar
        que contenga.
        1. Que La longitud sea mayor de 8 caracteres
        2. Contenga menos, 1 mayuscula y un caracter especial.
        */
        
        Scanner entrada = new Scanner(System.in);
        
        String usuario, clave;
        
        //System.out.println("Ingrese el usuario");
        //usuario = entrada.next();
        
        System.out.println("Ingrese la clave");
        clave = entrada.next();
        
       
        if(clave.indexOf("\"!·$%&/()=?¿*+´-\"") != -1) {
            System.out.println("La contraseña "+clave+" es valida");      
        }
        else
        {
            System.out.println("la contraseña "+clave+" no es valida"); 
        } 
        
    }
}  
        
    
    

