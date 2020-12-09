package com.company;

public class Tenis extends Calzado{

    public Tenis(double precio){
        setColor("Rojo");
        setMarca("Nike");
        setTalla(42);
        setTipo("Tenis");
        setPrecio(precio);
    }

    @Override
    public void Caracteristicas() {
        super.Caracteristicas();
        System.out.println("Haz tu compra de tenis ya!");
        System.out.println("Precio Original: "+getPrecio());
    }

    @Override
    public double precioCalzado() {
        return getPrecio()*0.9;
    }
}
