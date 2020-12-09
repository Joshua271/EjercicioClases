package com.company;

public class Botas extends Calzado{

    public Botas(double precio){
        setColor("Negro");
        setMarca("Siete Gatos");
        setTalla(40);
        setTipo("Botas");
        setPrecio(precio);
    }

    @Override
    public void Caracteristicas() {
        super.Caracteristicas();
        System.out.println("Haz tu compra de botas ya!");
        System.out.println("Precio Original: "+getPrecio());
    }

    @Override
    public double precioCalzado() {
        return getPrecio()*0.5;
    }
}
