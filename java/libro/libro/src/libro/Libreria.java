package libro;

import java.util.Arrays;
import java.util.Scanner;
import libro.Libro;

public class Libreria {
    public static int contLibro = 0;

    public static void main(String[] args) {
        
        String titulo;
        String autor;
        String genero;
        int evaluar;
        int numeroPaginas;
        int opcion;

        Scanner sc = new Scanner(System.in);
        Libro libro1 = new Libro();
        Libro vectorlibro[] = new Libro[10];

        do {
            System.out.println("1. Agregar libro\n" +
                    "2. Evaluar libro\n" +
                    "3. Mostrar libro\n" +
                    "4. Libros con evalucion de 5+\n" +
                    "5. Libros con evaluacion de 5-\n" +
                    "6. Asignar genero del libro:\n" +
                    "0. Salir.\n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Escribe el titulo del libro: ");
                    titulo = sc.nextLine();
                    libro1.setTitulo(titulo);
                    System.out.println("\n");

                    System.out.println("Escribe el autor del libro: ");
                    autor = sc.nextLine();
                    libro1.setAutor(autor);
                    System.out.println("\n");

                    System.out.println("Escribe el genero del libro: ");
                    genero = sc.nextLine();
                    libro1.setGenero(genero);
                    System.out.println("\n");

                    System.out.println("Introduce el numero de paginas: ");
                    numeroPaginas = sc.nextInt();
                    libro1.setNumeroPagina(numeroPaginas);
                    System.out.println("\n");

                    vectorlibro[Libreria.contLibro] = libro1;
                    Libreria.contLibro = Libreria.contLibro++;
                    System.out.println("Libro agregado !!");
                    break;
                case 2:
                    // revisar
                    System.out.println("Introduce el titulo del libro a evaluar:");
                    titulo = sc.nextLine();
                    if (libro1.getTitulo().equals(titulo)) {
                        System.out.println("Evalua el libro:");
                        evaluar = sc.nextInt();
                        libro1.evaluarLibro(evaluar);
                        System.out.println("libro evaluado :)");
                    } else {
                        System.out.println("El libro no se encuentra :(");
                    }

                    break;
                case 3:
                    for (int i = 0; i < Libreria.contLibro; i++) {
                        System.out.println(vectorlibro[i].toString());
                    }
                    break;
                case 4:
                    // pendiente usar algoritmo de ordenamiento 4 y 5 opcion
                    Arrays.sort(vectorlibro);
                    for (int i = 0; i < vectorlibro.length; i++) {
                        System.out.println(vectorlibro[i].getEvaluacion());
                        
                    }
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.println("Introduce el titulo del libro, asigana el genero:");
                    genero = sc.nextLine();
                    if (libro1.getTitulo().equals(genero)) {
                        System.out.println("Evalua el libro:");
                        evaluar = sc.nextInt();
                        libro1.setGenero(genero);
                        System.out.println(libro1.toString());
                    } else {
                        System.out.println("El libro no se encuentra :(");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("intruccion no valida");
            }
        } while (opcion != 0);

    }
}
