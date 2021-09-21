/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Conejo;
import Entidades.Pajaro;
import Entidades.Pato;
import java.util.Scanner;

/**
 *
 * @author jhosenny
 */
public class Servicio {
    
    public void crear_MostrarConejoPatoPajaro(){
        Conejo conejo=new Conejo();
        conejo.setName("Rodolfo");
        conejo.setColor("Blue");
        conejo.setAge(2);
        
        Pato pato = new Pato("Claudio", "Green", 3);
        
        Pajaro pajaro = new Pajaro();
        pajaro.setName("Franchesco");
        pajaro.setColor("black");
        pajaro.setAge(5);
        
        System.out.println("El conejo="+conejo.toString());
        System.out.println("El pato="+pato.toString());
        System.out.println("El pajaro="+pajaro.toString()); 
        
    }
    
}
