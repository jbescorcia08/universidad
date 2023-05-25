package videoClub;

public class Producto {

    protected String titulo;
    protected String alquilado;
    protected int plazo;
    protected int precio;

    public Producto(String titulo, int plazo, int precio) {
        this.titulo = titulo;
        this.alquilado = "no";
        this.plazo = plazo;
        this.precio = precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAlquilado() {
        if(this.equals("no")){
            this.alquilado = "si";
        }
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public String getAlquilado() {
        return alquilado;
    }

    public int getPlazo() {
        return plazo;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "\n[titulo=" + titulo + 
        ",\nalquilado=" + alquilado + 
        ",\nplazo=" + plazo + 
        ",\nprecio=" + precio
                + "]";
    }
    
}
