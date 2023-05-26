
package calculadora.imc;

public class Persona {
    private final String nombre;
    private int edad;
    private static  int dni = 0;
    private final char sexo;
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
            this.sexo = ' '; 
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public String dniCol(){
        Persona.dni++;
        return "DNICOL"+Persona.dni;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("DNI=").append(dniCol());
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", sexo=").append(sexo);
        sb.append(", peso=").append(peso);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }
    
    
}
