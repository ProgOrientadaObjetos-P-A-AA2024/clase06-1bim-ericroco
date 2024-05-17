/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Computador {

    private String marca;
    private Procesador procesador;
    private Memoria memoria;
    private double costoComputador;

    public Computador(String m, Memoria mem, Procesador pro) {
        marca = m;
        memoria = mem;
        procesador = pro;
    }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerMarca(String ma) {
        marca = ma;
    }

    public Procesador obtenerProcesador() {
        return procesador;
    }

    public void establecerProcesador(Procesador pro) {
        procesador = pro;
    }

    public Memoria obtenerMemoria() {
        return memoria;
    }

    public void establecerMemoria(Memoria mem) {
        memoria = mem;
    }

    public void establecerCostoComputador() {
        costoComputador = memoria.obtenerCosto() + procesador.obtenerCosto();

    }

    public double obtenerCostoComputador() {
        return costoComputador;
    }

    @Override
    public String toString() {
        String cadena = String.format("Marca Computadora: %s\n"
                + "Marca Memoria: %s\nMarca Procesador: %s\nCosto Memoria: %.2f"
                + "\nCosto Procesador: %.2f\nCosto Computador: %.2f\n"
                ,obtenerMarca(),obtenerMemoria().obtenerMarca()
                ,obtenerProcesador().obtenerMarca()
                ,obtenerMemoria().obtenerCosto()
                ,obtenerProcesador().obtenerCosto()
                ,obtenerCostoComputador());
        return cadena;
    }
}
