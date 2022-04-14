/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_12;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        hacer un programa que simule un cajero automatico con un saldo inicial de 1000
        dolares, con el siguiente menu de opciones;
        1. ingresar dinero a la cuenta
        2. retirar dinero de la cuenta
        3. salir
        */
        
        final int saldoInicial = 1000;
        int cliente;
        float  operacion, saldoActual, retiro;
        
        cliente = Integer.parseInt(JOptionPane.showInputDialog("1. ingresar dinero a la cuenta\n" 
        +"2. retirar dinero de la cuenta\n" 
        +"3. salir"));
        
        switch(cliente){
            case 1: operacion = Float.parseFloat(JOptionPane.showInputDialog("ingresa la cantidad de dinero"));
                                saldoActual = saldoInicial + operacion;
                                JOptionPane.showMessageDialog(null, "Este es el saldo actual; "+saldoActual);
                                break;
            case 2: retiro = Integer.parseInt(JOptionPane.showInputDialog("ingresa la cantidad que desea sacar"));
                                if (retiro > saldoInicial){
                                JOptionPane.showMessageDialog(null, "Usted no cuenta con dinero suficiente para retirar");
                                }else{
                                saldoActual = saldoInicial - retiro;
                                JOptionPane.showMessageDialog(null,"Esta es la cantidad actual de dinero; "+saldoActual);
                                }
                                break;
            case 3: 
                                break;
            default: JOptionPane.showMessageDialog(null, "Ha ingresado una opcion incorrecta");                    
        }
    }
    
}
