package reloj;

public class Relojes {
    private int hora, minuto, segundos;

    public Relojes() {
        this.hora = 0;
        this.minuto = 0;
        this.segundos = 0;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String consultarHora(){
        return this.hora +":"+this.minuto+":"+this.segundos;
    }
    public void recet(){
        this.hora = 0;
        this.minuto = 0;
        this.segundos = 0;
    }
}
