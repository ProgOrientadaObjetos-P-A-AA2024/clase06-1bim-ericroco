/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Calificacion {

    private double nota;
    private String nombreMateria;

    private Profesor profesor;

    public Calificacion(double n, String nombre) {
        nota = n;
        nombreMateria = nombre;
    }

    public Calificacion(double n, String nombre, Profesor p) {
        nota = n;
        nombreMateria = nombre;
        profesor = p;
    }

    public void establecerNota(double n) {
        nota = n;
    }

    public void establecerNombreMateria(String n) {
        nombreMateria = n;
    }

    public void establecerProfesor(Profesor n) {
        profesor = n;
    }

    public double obtenerNota() {
        return nota;
    }

    public String obtenerNombreMateria() {
        return nombreMateria;
    }

    public Profesor obtenerProfesor() {
        return profesor;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s - %s - %.2f\n", 
                    obtenerProfesor().obtenerNombre(), 
                    obtenerNombreMateria(),
                    obtenerNota());
        return cadena;
    }
}
