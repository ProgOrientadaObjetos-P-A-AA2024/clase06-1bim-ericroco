/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Procesador {

    private String marca;
    private double costo;

    public Procesador(String m, double c) {
        marca = m;
        costo = c;
    }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public double obtenerCosto() {
        return costo;
    }

    public void establecerCosto(double c) {
        costo = c;
    }

}
