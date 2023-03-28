package videoClub;

public class Pelicula extends Producto {

    private String genero;
    private String anio;
    private String dirrector;
    private String interprete;

    public Pelicula(String titulo, int plazo, int precio, String genero, String anio, String dirrector,
            String interprete) {
        super(titulo, plazo, precio);
        this.genero = genero;
        this.anio = anio;
        this.dirrector = dirrector;
        this.interprete = interprete;
    }

    @Override
    public String toString() {
        return "Pelicula: "+
        super.toString()+ 
        "\nPelicula [genero=" + genero + 
        ", \nanio=" + anio + 
        ", \ndirrector=" + dirrector + 
        ", \ninterprete=" + interprete + "]";       
    }
    
}
