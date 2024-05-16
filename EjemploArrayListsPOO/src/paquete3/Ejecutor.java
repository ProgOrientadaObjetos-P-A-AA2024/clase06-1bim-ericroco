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
        double costoC;

        System.out.println("Ingrese la cantidad de computadoras a registrar");
        cant = entrada.nextInt();

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese la marca del Computador");
            marcaC = entrada.nextLine();
            System.out.println("Ingrese el costo del Computador");
            costoC = entrada.nextDouble();
            System.out.println("Ingrese la marca de la Memoria");
            marcamem = entrada.nextLine();
            System.out.println("Ingrese el costo de la Memoria");
            costomem = entrada.nextDouble();

            Memoria mem = new Memoria(marcamem, costomem);

            System.out.println("Ingrese la marca del Procesador");
            marcaPr = entrada.nextLine();
            System.out.println("Ingrese el costo del Procesador");
            costoPr = entrada.nextDouble();

            Procesador pro = new Procesador(marcaPr, costoPr);
            Computador c1 = new Computador(marcaC, mem, pro, costoC);
        }

    }
}
