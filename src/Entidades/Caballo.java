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
public class Caballo {
    
  private String nombre;
  private Float tamanho;
  private int anhos;

    public Caballo() {
    }

    public Caballo(String nombre, Float tamanho, int anhos) {
        this.nombre = nombre;
        this.tamanho = tamanho;
        this.anhos = anhos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getTamanho() {
        return tamanho;
    }

    public void setTamanho(Float tamanho) {
        this.tamanho = tamanho;
    }

    public int getAnhos() {
        return anhos;
    }

    public void setAnhos(int anhos) {
        this.anhos = anhos;
    }
}
