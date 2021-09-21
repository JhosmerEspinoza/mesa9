/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Angel
 */
public class ServiceAnimales {
    public void MakingAnimals(){
    Gato cat =new Gato();
    Perro dog=new Perro();
    Caballo horse=new Caballo();
    cat.setAnhos(7);
    cat.setNombre("Tom");
    cat.setRaza("Egipcian");
    cat.setTamanho("Small");
    dog.setAge(5);
    dog.setName("Nina");
    dog.setRace("Caniche");
    dog.setWeight(50);
    horse.setAnhos(15);
    horse.setNombre("Bojack");
    horse.setTamanho("Big");
        System.out.println("Cat:"+cat.toString());
        System.out.println("Dog:"+dog.toString());
        System.out.println("Horse:"+horse.toString());
    
    
    }
}
