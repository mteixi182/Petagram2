package com.example.petagram;

public class Mascotas {
    private int imagen_mas;
    private String nombre_mas;
    private String descripcion_mas;

    public Mascotas(int imagen_mas, String nombre_mas, String descripcion_mas) {
        this.imagen_mas = imagen_mas;
        this.nombre_mas = nombre_mas;
        this.descripcion_mas = descripcion_mas;
    }

    public int getImagen_mas() {
        return imagen_mas;
    }

    public String getNombre_mas() {
        return nombre_mas;
    }

    public String getDescripcion_mas() {
        return descripcion_mas;
    }
}