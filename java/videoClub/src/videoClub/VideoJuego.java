package videoClub;

public class VideoJuego extends Producto {
    private String estilo;
    private String plataforma;

    public VideoJuego(String titulo, int plazo, int precio, String estilo, String plataforma) {
        super(titulo, plazo, precio);
        this.estilo = estilo;
        this.plataforma = plataforma;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    @Override
    public String toString() {
        return "Video Juego: "+
        super.toString()+ 
        "\nVideoJuego [estilo=" + estilo + 
        ",\nplataforma=" + plataforma + "]";
    }
    

}
