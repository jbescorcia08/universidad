package libro;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int numeroPaginas;
    private int evaluacion;
    
    

    public Libro(String titulo, String autor, String genero, int numeroPaginas, int evaluacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.evaluacion = 0;
    }

    public Libro() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroPagina() {
        return numeroPaginas;
    }

    public void setNumeroPagina(int numeroPagina) {
        if (numeroPagina > 0) {
            this.numeroPaginas = numeroPagina;
        } else {
            this.numeroPaginas = 1;
        }
    }

    public int getEvaluacion() {
        return evaluacion;
    }
    public void evaluarLibro(int evaluacion) {

        if (evaluacion >= 0 && evaluacion <= 10) {
            this.evaluacion = evaluacion;
        } else {
            System.out.println("Evalua el libro correctamente :)");
        }

    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", numeroPagina=" + numeroPaginas +
                ", evaluacion=" + evaluacion +
                '}';
    }    
    
}
