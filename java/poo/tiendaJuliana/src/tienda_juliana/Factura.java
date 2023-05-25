package tienda_juliana;

public class Factura {
    private int numeroFecha;
    private String fecha;
    private double valor;
    private String cliente;
    private String productos;

    public Factura(int numeroFecha, String fecha, double valor, String cliente, String productos) {
        this.numeroFecha = numeroFecha;
        this.fecha = fecha;
        this.valor = valor;
        this.cliente = cliente;
        this.productos = productos;
    }
    

    public Factura() {
        
    }


    public int getNumeroFecha() {
        return numeroFecha;
    }

    public void setNumeroFecha(int numeroFecha) {
        this.numeroFecha = numeroFecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Factura [numeroFecha=" + numeroFecha + ", fecha=" + fecha + ", valor=" + valor + ", cliente=" + cliente
                + ", productos=" + productos + "]";
    }
    
}
