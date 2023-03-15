package libro;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int numeroPagina;
    private int evaluacion;


    public Libro(String titulo, String autor, String genero, int numeroPagina, int evaluacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numeroPagina = numeroPagina;
        this.evaluacion = evaluacion;
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
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        if(numeroPagina > 0){
            this.numeroPagina = numeroPagina;
        }else {
            this.numeroPagina = 1;
        }
    }

    public int getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(int evaluacion) {
        if(evaluacion >= 0 && evaluacion <= 10){
            this.evaluacion = evaluacion;
        }else{
            System.out.println("La evaluacion solo esta permitida de 1 a 10");
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", numeroPagina=" + numeroPagina +
                ", evaluacion=" + evaluacion +
                '}';
    }
}
