package libro;

import java.util.Scanner;

public class Libreria {
    public static void main(String[] args) {
        String titulo;
        String autor;
        String genero;
        int evaluar;
        int numeroPaginas;
        int opcion;
        int i = 0;

        Scanner sc = new Scanner(System.in);
        Libro libro1 = null;
        Libro vectorLibro [] = new Libro[10];

        do {
            System.out.println("1. Agregar libro\n" +
                    "2. Evaluar libro\n" +
                    "3. Mostrar libro\n" +
                    "4. Libros con evalucion de 5+\n" +
                    "5. Libros con evaluacion de 5-\n" +
                    "6. Asignar genero del libro:\n"+
                    "0. Salir.");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Escribe el titulo del libro: ");
                    titulo = sc.nextLine();

                    System.out.println("Escribe el autor del libro: ");
                    autor = sc.nextLine();

                    System.out.println("Escribe el genero del libro: ");
                    genero = sc.nextLine();

                    System.out.println("Introduce el numero de paginas: ");
                    numeroPaginas = sc.nextInt();

                    libro1.setNumeroPagina(numeroPaginas);
                    vectorLibro[i] = libro1;
                    i++;
                    break;
                case 2:
                    System.out.println("Introduce el titulo del libro a evaluar:");
                    titulo = sc.nextLine();
                    if(libro1.getTitulo().equals(titulo)){
                        System.out.println(libro1.toString());
                        System.out.println("Evalua el libro:");
                        evaluar = sc.nextInt();
                        libro1.setEvaluacion(evaluar);
                    }else{
                        System.out.println("El libro no se encuentra :(");
                    }
                    break;
                case 3:
                    for (int j = 0; j < i; j++) {
                        System.out.println(vectorLibro[j].toString());
                    }
                case 4:
                    // pendiente usar algoritmo de ordenamiento 4 y 5 opcion
                    if (libro1.getEvaluacion() >= 5){
                        for (int j = 0; j < i; j++) {
                            System.out.println(libro1.toString());
                        }
                    }else {
                        System.out.println("No hay libros con evaluacion mayor o igual a 5");
                    }
                    break;
                case 5:
                    if (libro1.getEvaluacion() < 5){
                        for (int j = 0; j < i; j++) {
                            System.out.println(libro1.toString());
                        }
                    }else {
                        System.out.println("No hay libros con evaluacion menor a 5");
                    }
                    break;
                case 6:
                    System.out.println("Introduce el titulo del libro, asigana el genero:");
                    genero = sc.nextLine();
                    if(libro1.getTitulo().equals(genero)){
                        System.out.println("Evalua el libro:");
                        evaluar = sc.nextInt();
                        libro1.setGenero(genero);
                        System.out.println(libro1.toString());
                    }else{
                        System.out.println("El libro no se encuentra :(");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("intruccion no valida");
            }
        }while (opcion != 0);


    }
}
