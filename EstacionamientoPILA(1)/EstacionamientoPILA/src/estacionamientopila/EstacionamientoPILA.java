/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estacionamientopila;

import control.Pila.PILAd;
import control.Pila.nodoVehiculo;
import control.Registro.Registro;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author David
 */
public class EstacionamientoPILA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Actividad:
        Revisar los métodos pop creados en la clase PILAd
        Comentar que hace cada línea usando // adelante de 
        la instrucción.
        Una vez revisado en la clase main (aquí) Crear cinco
        objetos de la clase vehiculo y meterlos en la PILA que
        lleva el control de estacionamiento (Clase estacionamiento)
        una vez que un vehiculo sale, usar la función pop(placas) para
        recuperar que vehiculo salió y almacenarlo en la clase Registro
        
        Pueden trabajar en equipo y mandarlo al finalizar la clase.
        Suerte
        
        */

        PILAd Estacionamiento1 = new PILAd();

        nodoVehiculo c1 = new nodoVehiculo();
        nodoVehiculo c2 = new nodoVehiculo();
        nodoVehiculo c3 = new nodoVehiculo();
        nodoVehiculo c4 = new nodoVehiculo();
        nodoVehiculo c5 = new nodoVehiculo();

        Estacionamiento1.push(c1);
        Estacionamiento1.push(c2);
        Estacionamiento1.push(c3);
        Estacionamiento1.push(c4);
        Estacionamiento1.push(c5);

        Estacionamiento1.imprimir();
    }

}
