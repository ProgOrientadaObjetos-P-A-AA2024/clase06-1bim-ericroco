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

    public double obtenerValorVenta() {
        valorVenta = 0;
        for (int i = 0; i < computadoras.size(); i++) {
            valorVenta = valorVenta + computadoras.get(i).getCostoComputador();
        }
        return valorVenta;
    }

    public void establecerValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public ArrayList<Computador> obtenerComputadoras() {
        return computadoras;
    }

    public void establecerComputadoras(ArrayList<Computador> computadoras) {
        this.computadoras = computadoras;
    }

}
