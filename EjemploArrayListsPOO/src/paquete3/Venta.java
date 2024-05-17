/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Venta {

    private double valorVenta;
    private ArrayList<Computador> computadoras;

    public Venta(ArrayList<Computador> c) {
        computadoras = c;
    }

    public double obtenerValorVenta() {

        return valorVenta;
    }

    public void establecerValorVenta(double valorV) {
        valorVenta = 0;
        for (int i = 0; i < computadoras.size(); i++) {
            valorVenta = valorVenta + computadoras.get(i).obtenerCostoComputador();
        }

    }

    public ArrayList<Computador> obtenerComputadoras() {
        return computadoras;
    }

    public void establecerComputadoras(ArrayList<Computador> compu) {
        computadoras = compu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Valor de la venta: %s\n", valorVenta);
        return cadena;
    }
}
