/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorescombinadosarimtrica;

/**
 *
 * @author jesus
 */
public class OperadoresCombinadosArimtrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 10;
        numero +=5;// esta linea es igual a escribir; numero = numero +5;
        numero -=5;// numero = numero - 5;
        numero *=5;//numero = numero * 5;
        numero /=5;// numero = numero / 5;
        numero %=5;// numero = numero % 5;aca se saca el residuo de la division de numero = numero / 5; como resultado da 0.
        System.out.println("Este es el resultado "+numero);
    }
    
}
