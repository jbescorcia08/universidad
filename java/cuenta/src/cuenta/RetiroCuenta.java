package cuenta;
/*
 * Crea un proyecto en Java por ejercicio. Colocare en las soluciones algunos comentarios para que sean más fácilmente entendibles.

Acostúmbrate a usar Javadoc. Te recomiendo que uses mensajes de trazas, donde te sean necesarios. Si tienes problemas también puedes usar el depurador.
 */

import java.util.Scanner;

public class RetiroCuenta {
    static int contTitular = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta[] = new Cuenta[5];
        Cuenta titularCuenta = null;
        String clave;
        double cantidad;
        String titular;
        int opcion;

        do {
            System.out.println("1. Ingresar dinero.\n" +
                    "2. sacar dinero.\n" +
                    "3. mostrar cuenta.\n" +
                    "0. salir.");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa tu nombre:");
                    titular = sc.next();

                    System.out.println("Ingresa una clave:");
                    clave = sc.next();

                    System.out.println("Ingresa la cantidad de dinero a tu cuenta:");
                    cantidad = sc.nextDouble();

                    titularCuenta = new Cuenta(titular, clave, cantidad);
                    cuenta[contTitular] = titularCuenta;
                    contTitular++;
                    break;
                case 2:

                    for (int i = 0; i < contTitular; i++) {
                        System.out.println("Ingresa la clave");
                        clave = sc.next();
                        if (cuenta[i].getClave().equals(clave)) {
                            System.out.println("ingresa la cantidad de dinero a sacar: ");
                            cantidad = sc.nextDouble();
                            cuenta[i].sacarDinero(cantidad);
                        } else {
                            System.out.println("Error !!, vuelve a intentarlo :");
                        }
                    }
                    break;
                case 3:
                    if (titularCuenta != null) {
                        System.out.println("Ingresa la clave de el titular de la cuenta");
                        clave = sc.next();
                        for (int i = 0; i < contTitular; i++) {
                            if (cuenta[i].getClave().equals(clave)) {
                                cuenta[i].toString();
                            } else {
                                continue;
                            }
                        }
                    } else {
                        System.out.println("Agrega una cuenta.");
                    }
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Opcion ingresada no valida !!");

            }

        } while (opcion != 0);
    }
}
