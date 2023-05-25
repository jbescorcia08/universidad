
package calculadora.imc;

public class Persona {
    private String nombre;
    private int edad;
    private static  int dni = 0;
    private char sexo;
    private int peso;
    private double altura;

    public Persona(String nombre, int edad, char sexo, int peso, double altura) {
        this.nombre = nombre;
        if(edad > 0 && edad < 99){
            this.edad = edad;
        }else{
            this.edad = 0;
        }
        if(sexo == 'M' && sexo == 'H' ){
            this.sexo = sexo;
        } else {
            this.sexo = '?';
        }
        if(peso > 0){
            this.peso = peso;
        }else{
            this.edad = 0;
        }
        if(altura > 0){
            this.altura = altura;
        }else{
            this.altura = 0;
        }
        
    }
    
    public String dniCol(){
        Persona.dni++;
        return "DNICOL"+Persona.dni;
    }
    
    
}
