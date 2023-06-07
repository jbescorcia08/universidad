/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroAlumnos;

/**
 *
 * @author Sistemas
 */
public class Alumno {
    private String nonbre;
    private String carrera;
    private String semestre;
    private int grupo;
    private double promedio;

    public Alumno(String nonbre, String carrera, String semestre, int grupo, double promedio) {
        this.nonbre = nonbre;
        this.carrera = carrera;
        this.semestre = semestre;
        this.grupo = grupo;
        this.promedio = promedio;
    }

    
    
    public Alumno(){
        
    }

    public String getNonbre() {
        return nonbre;
    }

    public void setNonbre(String nonbre) {
        this.nonbre = nonbre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "nonbre=" + nonbre + ", carrera=" + carrera + ", grupo=" + grupo + ", promedio=" + promedio + '}';
    }
    
}
