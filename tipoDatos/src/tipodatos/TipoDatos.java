/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipodatos;

/**
 *
 * @author Sistemas
 */
public class TipoDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("ESTOS TIPOS DE DATOS SON ENTEROS");
        byte entero; // byte; este tipo de datos almacena 8byte  y su rango es de -127 a 127 
        entero = 12;
        System.out.println("Este es un numero entero "+entero);
        
        short entero1; /* short; este tipo de dato ocupa 16 byte de memoria y almacena 
        -32,768 a 32,768 
        */
        entero1 = 14550;
        System.out.println("Este es un numero entero !! "+entero1);
        
        int entero2;/*int; tipo de dato entero, es tipo de dato mas usado como variable
        entera
        */
        entero2= 23232323;
        System.out.println("Este es un numero entero !!!"+entero2);
        
        long entero3; /*long; este tipo de datos cubre el mayor rango de una variable entera
        */
        entero3=233223723;
        System.out.println("Este es un entero!!!! "+entero3);
        
        System.out.println("TIPOS DE DATOS PUNTO DECIMAL es decir NUMEROS REALES");
        float decimal = 3.12f;/* este tipo de datos ocupa 32 byte en memoria, se expresa
        de la siguiente forma "float decimal = 3.12f" OJO para darle el valor aun tipo de 
        datos tipo float hay que especificar el tipo, de ese modo se le agrega f al final
        del numero como lo vemos.
        */
        System.out.println("Este es un tipo de datos decimal "+decimal);
        
        double decimal1=12.21212f;/*este tipo de datos decimal cubre la mayor ragon de una mariable decimal
        recuerda que decimal pertenece a los reales y tambien hay que aplicar la f al final del valor de la 
        variable decimal !!
        */
        System.out.println("Esta es una variable decimal "+decimal1);
        
        System.out.println("ESTOS TIPOS DE DATOS PERTENCEN A LOS String");
        
        char caracter = 'a'; /* este tipo de datos corresponde a una letra por ejem...
        puede ser una 'h, t, r' entre otras letras, por ser una caracter se usa 
        las comillas simples
        */
        System.out.println("Este es un caracter "+caracter);
        
        
    }
    
}
