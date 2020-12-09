package com.company;

public abstract class Calzado{

    private String color;
    private int talla;
    private String marca;
    private String tipo;
    private double precio;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void Caracteristicas(){
        System.out.println("===================================");
        System.out.println("Tipo de calzado: "+getTipo());
        System.out.println("Color: "+getColor());
        System.out.println("Talla: "+getTalla());
        System.out.println("Marca: "+getMarca());
    }

    public abstract double precioCalzado();
}
