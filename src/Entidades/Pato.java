/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author jhosenny
 */
public class Pato {
    private String nombre;
    private String color;
    private int edad;

    public Pato() {
    }
    

    public Pato(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }    

    @Override
    public String toString() {
        return "Pato{" + "nombre=" + nombre + ", color=" + color + ", edad=" + edad + ", sexo=" + '}';
    }
    
}
