package Entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhosenny
 */
public class Gato {
    private String nombre;
    private String raza;
    private Integer anhos;
    private String tamanho;

    public Gato() {
    }

    public Gato(String nombre, String raza, Integer anhos, String tamanho) {
        this.nombre = nombre;
        this.raza = raza;
        this.anhos = anhos;
        this.tamanho = tamanho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getAnhos() {
        return anhos;
    }

    public void setAnhos(Integer anhos) {
        this.anhos = anhos;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", raza=" + raza + ", anhos=" + anhos + ", tamanho=" + tamanho + '}';
    }
    
    
    
}
