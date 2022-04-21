package com.example.demo;

public class Persona {
    String Nombre;
    String Ciudad;
    String Edad;

    public Persona(String nombre, String ciudad, String edad) {
        Nombre = nombre;
        Ciudad = ciudad;
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", Ciudad='" + Ciudad + '\'' +
                ", Edad='" + Edad + '\'' +
                '}';
    }
}
