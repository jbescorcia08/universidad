package libro;

import java.util.Arrays;
import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int numeroPaginas;
    private int evaluacion;
    private Libro vectorlibro[] = new Libro[10];
    public static int contLibro = 0;

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

    public void agregarLibro(Libro libro) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el titulo del libro: ");
        titulo = sc.nextLine();
        libro.setTitulo(titulo);

        System.out.println("Escribe el autor del libro: ");
        autor = sc.nextLine();
        libro.setAutor(autor);

        System.out.println("Escribe el genero del libro: ");
        genero = sc.nextLine();
        libro.setGenero(genero);

        System.out.println("Introduce el numero de paginas: ");
        numeroPaginas = sc.nextInt();
        libro.setNumeroPagina(numeroPaginas);

        vectorlibro[Libro.contLibro] = libro;
        Libro.contLibro = ++Libro.contLibro;
    }

    public void mostrarLibros() {
        for (int i = 0; i < Libro.contLibro; i++) {
            if (vectorlibro[i] == null) {
                System.out.println("No hay libros guardados :(");
            } else {
                System.out.println(vectorlibro[i].toString());
            }
        }
    }

    public void evaluarLibro(int evaluacion) {

        if (evaluacion >= 0 && evaluacion <= 10) {
            this.evaluacion = evaluacion;
        } else {
            System.out.println("Evalua el libro correctamente :)");
        }

    }

    public void libroEvaluadoMayor() {
        Arrays.sort(vectorlibro);
        for (int i = 0; i < vectorlibro.length; i++) {
            System.out.println(vectorlibro[i].getEvaluacion());
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
