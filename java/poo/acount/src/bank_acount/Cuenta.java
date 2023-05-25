
package bank_acount;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        if(cantidad + this.cantidad > 0){
            this.cantidad = cantidad;
        }else{
            this.cantidad = 0;
        }
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

    public void addDinero(double cantidad) {
        if(cantidad + this.cantidad > 0){
            this.cantidad += cantidad;
        }else{
            this.cantidad = 0;
        }
    }
    
    
    public void retirar(double retiro){
        if(this.cantidad - retiro <= 0){
            this.cantidad = 0;
        }else{
            this.cantidad -= retiro;
        }
    }
    

   

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{");
        sb.append("titular=").append(titular);
        sb.append(", cantidad=").append(cantidad);
        sb.append('}');
        return sb.toString();
    }
    
    
}
