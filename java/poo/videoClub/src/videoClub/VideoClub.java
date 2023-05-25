package videoClub;

import java.util.Scanner;

public class VideoClub {
    static int contadorProducto = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo, genero, anio, dirrector, interprete, estilo, plataforma;

        int plazo, precio, opcion;

        Pelicula pelicula1 = null;
        VideoJuego videoJuego = null;

        Producto vectorProducto[] = new Producto[10];

        do {
            System.out.println("Escoja la opcion: \n" +
                    "1. Crear Pelicula.\n" +
                    "2. Crear videoJuego\n" +
                    "3. Ver producto\n" +
                    "4. Alquilar Producto\n" +
                    "5. Lista Productos\n" +
                    "0. Salir.");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Escribe el titulo: ");
                    titulo = sc.next();
                    System.out.println("Plazo de alquiler");
                    plazo = sc.nextInt();
                    System.out.println("Precio de alquiler");
                    precio = sc.nextInt();
                    System.out.println("Escribe el Genero");
                    genero = sc.next();
                    System.out.println("Año");
                    anio = sc.next();
                    System.out.println("Dirrector");
                    dirrector = sc.next();
                    System.out.println("Interprete");
                    interprete = sc.next();
                    pelicula1 = new Pelicula(titulo, plazo, precio, genero, anio, dirrector, interprete);
                    vectorProducto[contadorProducto] = pelicula1;
                    VideoClub.contadorProducto++;
                    break;
                case 2:
                    System.out.println("Escribe el titulo: ");
                    titulo = sc.next();
                    System.out.println("Plazo de alquiler");
                    plazo = sc.nextInt();
                    System.out.println("Precio de alquiler");
                    precio = sc.nextInt();
                    System.out.println("Estilo: ");
                    estilo = sc.next();
                    System.out.println("Plataforma: ");
                    plataforma = sc.next();
                    videoJuego = new VideoJuego(titulo, plazo, precio, estilo, plataforma);
                    vectorProducto[VideoClub.contadorProducto] = videoJuego;
                    VideoClub.contadorProducto++;
                    break;
                case 3:
                    for (int i = 0; i < VideoClub.contadorProducto; i++) {
                        vectorProducto[VideoClub.contadorProducto].toString();
                    }
                    break;
                case 4:
                    System.out.println("Ingresa el titulo");
                    titulo = sc.next();
                    for (int i = 0; i < VideoClub.contadorProducto; i++) {
                        if(vectorProducto[i].getTitulo().equalsIgnoreCase(titulo)){
                            vectorProducto[i].setAlquilado();
                        }
                        
                    }
                    break;
                case 5:
                    for (int i = 0; i < VideoClub.contadorProducto; i++) {
                        if(vectorProducto[i].getAlquilado().equalsIgnoreCase("si")){
                            
                        }
                    }


            }
        } while (opcion != 0);

    }
}
