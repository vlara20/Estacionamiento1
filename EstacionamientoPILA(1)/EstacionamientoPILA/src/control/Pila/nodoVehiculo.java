/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control.Pila;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author David
 */
public class nodoVehiculo {
    public String placas;
    public String color;
    public String modelo;
    public String tipo; //Carro, camioneta, motocicleta
    public nodoVehiculo siguiente;
    public int anio;
    public String he;
    public String hs;
    
    public nodoVehiculo(){
    }
    
    public nodoVehiculo(String p, String c, String m, String t,int a){
        this.placas=p;
        this.color=c;
        this.modelo=m;
        this.tipo=t;
        this.anio=a;
        this.siguiente=null;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public nodoVehiculo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoVehiculo siguiente) {
        this.siguiente = siguiente;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getHe() {
        return he;
    }

    public void setHe() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        this.he=dateFormat.format(date);
    }

    public String getHs() {
        return hs;
    }

    public void setHs() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        this.hs=dateFormat.format(date);
    }
    
    
    
}
