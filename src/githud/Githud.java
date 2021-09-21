/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githud;


import Servicios.ServiceAnimales;

import Servicios.Servicio;


/**
 *
 * @author jhosenny
 */
public class Githud {
    public static void main(String[] args) {

        ServiceAnimales sAnimales=new ServiceAnimales();
        sAnimales.MakingAnimals();

        Servicio servi=new  Servicio();
        servi.crear_MostrarConejoPatoPajaro();
        
   
        
    }
    
}
