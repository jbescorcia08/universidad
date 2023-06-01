
package cadenas;

//@author Sistemas

public class Cadenas {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String mensaje = "hola soy un String";
        
        int intMensaje = mensaje.length();
        boolean contineMensaje = mensaje.contains("h");
        boolean empiezaCon = mensaje.startsWith("h");
        boolean terminaCon = mensaje.endsWith("g");
          

        
        // logitud y output booleanos //
        System.out.println(mensaje);
        System.out.println(intMensaje);
        System.out.println(contineMensaje);
        System.out.println(empiezaCon);
        System.out.println(terminaCon);
        
        
        // dar formatos //
        
        // mayusculas
        System.out.println(mensaje.toUpperCase());
        // minusculas
        System.out.println(mensaje.toLowerCase());
        // quitar espacios
        System.out.println(mensaje.trim());
        
        
        // metodo format genera un nuevo string al llamarlo
        
        // string
        String mensaje1 = "";
        String.format("Bienvenido al curso de %s", "java");
        System.out.println(mensaje1);
        
        // float
        float valor = 12.1212f;
        mensaje1 = String.format("valor = %.2f",valor);
        System.out.println(mensaje1);
        mensaje1 = String.format("Hola %d numeros con un float %.4f mas un %s", 2, valor, mensaje);
        System.out.println(mensaje1);
        System.out.printf("Hola %d numeros con un float %.4f mas un %s", 2, valor, mensaje);
        
    }

}
