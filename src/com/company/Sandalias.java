package com.company;

public class Sandalias extends Calzado{

    public Sandalias(double precio){
        setColor("Marron");
        setMarca("Sergius");
        setTalla(35);
        setTipo("Sandalia");
        setPrecio(precio);
    }

    @Override
    public void Caracteristicas() {
        super.Caracteristicas();
        System.out.println("Haz tu compra de sandalias ya!");
        System.out.println("Precio Original: "+getPrecio());
    }

    @Override
    public double precioCalzado() {
        return getPrecio()*0.85;
    }
}
