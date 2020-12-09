package com.company;

public class Main {

    public static void main(String[] args) {

        Calzado c1 = new Tenis(1500);
        Calzado c2 = new Sandalias(800);
        Calzado c3 = new Botas(150);

        c1.Caracteristicas();
        System.out.println("Precio al 10% de descuento: "+c1.precioCalzado()+"\n");

        c2.Caracteristicas();
        System.out.println("Precio al 15% de descuento: "+c2.precioCalzado()+"\n");

        c3.Caracteristicas();
        System.out.println("Precio al 50% de descuento: "+c3.precioCalzado()+"\n");
        System.out.println("===================================");
    }
}
