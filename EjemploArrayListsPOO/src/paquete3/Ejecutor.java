/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.*;

/**
 *
 * @author StarMedia
 */
public class Ejecutor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cant;
        String marcamem;
        double costomem;
        String marcaPr;
        double costoPr;
        String marcaC;
        ArrayList<Computador> computadoras = new ArrayList<>();
        String almacenador = "";
        String aux = "";

        System.out.println("Ingrese la cantidad de computadoras a registrar");
        cant = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese la marca del Computador");
            marcaC = entrada.nextLine();
            System.out.println("Ingrese la marca de la Memoria");
            marcamem = entrada.nextLine();
            System.out.println("Ingrese el costo de la Memoria");
            costomem = entrada.nextDouble();

            Memoria mem = new Memoria(marcamem, costomem);
            entrada.nextLine();
            System.out.println("Ingrese la marca del Procesador");
            marcaPr = entrada.nextLine();
            System.out.println("Ingrese el costo del Procesador");
            costoPr = entrada.nextDouble();

            Procesador pro = new Procesador(marcaPr, costoPr);
            Computador c1 = new Computador(marcaC, mem, pro);
            c1.establecerCostoComputador();
            entrada.nextLine();
            almacenador = String.format("%s%s", almacenador, c1);
            computadoras.add(c1);
            Venta ve = new Venta(computadoras);
            ve.establecerValorVenta(c1.obtenerCostoComputador());
            aux = String.format("%s", ve);

        }
        System.out.printf("%s%s", almacenador, aux);
    }
}
