package bank_acount;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("jesus", 50);
        JOptionPane.showMessageDialog(null, cuenta1.toString());
        cuenta1.retirar(10);
        JOptionPane.showMessageDialog(null, cuenta1.toString());
        cuenta1.addDinero(200);
        JOptionPane.showMessageDialog(null, cuenta1.toString());
    }
    
    
    

}
