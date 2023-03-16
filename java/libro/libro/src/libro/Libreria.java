package libro;

import java.util.Arrays;
import java.util.Scanner;
import libro.Libro;

public class Libreria {
    public static int contLibro = 0;
    static Libro vectorlibro[] = new Libro[10];

    public static void main(String[] args) {

        String titulo;
        String autor;
        String genero;
        int evaluar;
        int numeroPaginas;
        int opcion;

        Libro libro1 = null;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Agregar libro\n" +
                    "2. Evaluar libro\n" +
                    "3. Mostrar libro\n" +
                    "4. Libros con evalucion de mayor a menor\n" +
                    "5. Libros con evaluacion de menor a mayor\n" +
                    "6. Asignar genero del libro:\n" +
                    "0. Salir.\n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:

                    System.out.println("Escribe el titulo del libro: ");
                    titulo = sc.next();
                    System.out.println("\n");

                    System.out.println("Escribe el autor del libro: ");
                    autor = sc.next();
                    System.out.println("\n");

                    System.out.println("Introduce el numero de paginas: ");
                    numeroPaginas = sc.nextInt();
                    System.out.println("\n");

                    libro1 = new Libro(titulo, autor, numeroPaginas);
                    vectorlibro[Libreria.contLibro] = libro1;
                    Libreria.contLibro++;
                    System.out.println("Libro agregado !!");
                    System.out.println("\n");
                    break;
                case 2:
                    
                    if (libro1 == null) {
                        System.out.println("No hay libros a evaluar");
                    } else {
                        System.out.println("Introduce el titulo del libro a evaluar:");
                        titulo = sc.next();
                        for (int i = 0; i < Libreria.contLibro; i++) {
                            if (vectorlibro[i].getTitulo().equals(titulo)) {
                                System.out.println("Evalua el libro:");
                                evaluar = sc.nextInt();
                                vectorlibro[i].evaluarLibro(evaluar);
                                System.out.println("libro evaluado :)\n");
                            } else {
                                continue;
                            }

                        }

                    }
                    System.out.println("\n");
                    break;
                case 3:
                    if (libro1 == null) {
                        System.out.println("No hay libros agrega algunos :)\n");
                    } else {
                        for (int i = 0; i < Libreria.contLibro; i++) {
                            System.out.println(vectorlibro[i]);
                        }
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    // pendiente usar algoritmo de ordenamiento 4 y 5 opcion
                    Libro vectLibroD[] = vectorlibro.clone();
                    Libro tempD;
                    for (int i = 0; i < Libreria.contLibro; i++) {
                        for (int j = 0; j < Libreria.contLibro - 1; j++) {
                            if (vectLibroD[j].getEvaluacion() > vectLibroD[j + 1].getEvaluacion()) {
                                tempD = vectLibroD[j];
                                vectLibroD[j] = vectLibroD[j + 1];
                                vectLibroD[j + 1] = tempD;
                            }
                        }
                    }
                    for (int i = Libreria.contLibro-1; i >= 0; i--) {
                        if(vectLibroD[i] != null){
                            System.out.println(vectLibroD[i]);
                        }else{
                            continue;
                        }
                    }
                    System.out.println("\n");
                    break;
                case 5:
                    Libro vectLibroO[] = vectorlibro.clone();
                    Libro temp;
                    for (int i = 0; i < Libreria.contLibro; i++) {
                        for (int j = 0; j < Libreria.contLibro - 1; j++) {
                            if (vectLibroO[j].getEvaluacion() > vectLibroO[j + 1].getEvaluacion()) {
                                temp = vectLibroO[j];
                                vectLibroO[j] = vectLibroO[j + 1];
                                vectLibroO[j + 1] = temp;
                            }
                        }
                    }
                    for (Libro ord : vectLibroO) {
                        if(ord != null){
                            System.out.println(ord);
                        }else{
                            continue;
                        }
                    }
                    System.out.println("\n");
                    break;
                case 6:
                    if (libro1 == null) {
                        System.out.println("No hay libros al que puedas agregar el genero");
                    } else {
                        System.out.println("Introduce el titulo del libro, asigana el genero:");
                        titulo = sc.next();
                        for (int i = 0; i < Libreria.contLibro; i++) {
                            if (vectorlibro[i].getTitulo().equals(titulo)) {
                                System.out.println("Evalua el libro:");
                                genero = sc.next();
                                vectorlibro[i].setGenero(genero);
                                System.out.println(vectorlibro[i].toString());
                            } else {
                                continue;
                            }
                        }
                    }
                    System.out.println("\n");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("intruccion no valida");
            }
        } while (opcion != 0);

    }


}
