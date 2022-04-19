/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class While {

    /*
      ciclo While
        while(condicion){
        Instruccion;
    }
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i=1, numero;
        
        System.out.println("Digite un numero");
        numero = entrada.nextInt();
        
        while(i<=numero){
            System.out.println(i);
            i+=2;
        }
    }
    
}
