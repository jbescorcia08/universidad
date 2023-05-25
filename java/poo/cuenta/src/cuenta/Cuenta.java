package cuenta;

import java.util.Scanner;

public class Cuenta {
    private String titular;
    private String clave;
    private double cantidad;

    public Cuenta(String titular, String clave, double cantidad) {
        this.titular = titular;
        this.clave = clave;
        this.cantidad = cantidad;

    }

    public Cuenta() {

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("error al ingresar valores");
        }
    }

    public String getClave() {
        return clave;
    }

    public void sacarDinero(Double cantidad){
        if(this.cantidad < cantidad ){
            System.out.println("Saldo insuficiente: "+this.cantidad);
        }else{
            this.cantidad = this.cantidad - cantidad;
            System.out.println("Saldo : "+this.cantidad);

            
        }
    }

    @Override
    public String toString() {
        return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
    }

}
