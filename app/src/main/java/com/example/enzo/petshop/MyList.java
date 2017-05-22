package com.example.enzo.petshop;

/**
 * Created by Asus on 22/05/2017.
 */

public class MyList {

    private String nombre_veterinaria;
    private String descripcion_veterinaria;
    private String direccion_veterinaria;

    public MyList(){}

    public MyList(String nombre_veterinaria, String descripcion_veterinaria, String direccion_veterinaria) {
        this.nombre_veterinaria = nombre_veterinaria;
        this.descripcion_veterinaria = descripcion_veterinaria;
        this.direccion_veterinaria = direccion_veterinaria;
    }

    public String getNombre_veterinaria() {
        return nombre_veterinaria;
    }

    public void setNombre_veterinaria(String nombre_veterinaria) {
        this.nombre_veterinaria = nombre_veterinaria;
    }

    public String getDescripcion_veterinaria() {
        return descripcion_veterinaria;
    }

    public void setDescripcion_veterinaria(String descripcion_veterinaria) {
        this.descripcion_veterinaria = descripcion_veterinaria;
    }

    public String getDireccion_veterinaria() {
        return direccion_veterinaria;
    }

    public void setDireccion_veterinaria(String direccion_veterinaria) {
        this.direccion_veterinaria = direccion_veterinaria;
    }


}
