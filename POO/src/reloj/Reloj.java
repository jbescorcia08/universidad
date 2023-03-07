package reloj;

import java.util.Scanner;

public class Reloj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Relojes casio = new Relojes();
        int hora, minuto, segundo, opcion;

        do{
            System.out.println("1. Consultar Hora\n"+
                    "2. Cambiar hora\n"+
                    "3. Cambiar Minutos\n"+
                    "4. Cambiar segundos\n"+
                    "5. Recetear Hora\n"+
                    "6. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println(casio.consultarHora());
                    break;
                case 2:
                    System.out.println("Introduce la hora: ");
                    hora = sc.nextInt();
                    casio.setHora(hora);
                    break;
                case 3:
                    System.out.println("Introduce los minutos: ");
                    minuto = sc.nextInt();
                    casio.setMinuto(minuto);
                    break;
                case 4:
                    System.out.println("Introduce segundos: ");
                    segundo = sc.nextInt();
                    casio.setSegundos(segundo);
                    break;
                case 5:
                    casio.recet();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Error: ingresa un valor correcto");
            }
        }while (opcion != 6);
    }
}
