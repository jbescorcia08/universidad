/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_9;

import javax.swing.JOptionPane;

/**
 *
 * @author Sistemas
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Pedir el dia, mes y año de una pecha e indicar si la fecha es correcta. suponiendo que los meses son de 30 dias.
        */
        int dia, mes, ano;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes ")); 
        ano = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año "));

        if((dia>=1)&&(dia<=30)){
            if((mes>=1)&&(mes<=12)){
                if(ano !=0){
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                }else{
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, El año no es correcto");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, El mes no es correcto 1");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Fecha incorrecta, Dia no es correcto !!" );
        }
    }
    
}
