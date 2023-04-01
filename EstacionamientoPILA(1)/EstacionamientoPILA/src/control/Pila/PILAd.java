/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control.Pila;

/**
 *
 * @author David
 */
public class PILAd {
    public int cima;
    public nodoVehiculo inicio;
    public nodoVehiculo ultimo;
    
    public PILAd(){
        this.cima=0;
        this.inicio=null;
        this.ultimo=null;
    }
    
    public void push(nodoVehiculo t){
        if(this.inicio==null){
            inicio=t;
            ultimo=t;
        }
        else{
            t.siguiente=ultimo;
            this.ultimo=t;
        }
        this.cima=this.cima+1;
    }
    public nodoVehiculo pop(String p){
        nodoVehiculo t=null;
        nodoVehiculo b=null;
        //Se declaran dos variables de tipo nodoVehiculo
        PILAd pilatemporal=new PILAd();
        //Se crea un objeto de la clase PILAd
        if(isVacia()==false){//Se comprueba si la pila esta vacia, en caso de que no este vacia entra en la condicion
            b=this.existePlaca(p); //La variable b recibe el valor de la funcion existePlaca
            if(b!=null){//Si b es diferente de nulo entra en esta condicion
                nodoVehiculo t1=null;
                for(int i=cima;i>=1;i--){//Se recorre la pila
                    t1=pop();//Se van sacando los vehiculos de la pila
                    if(t1==b){//Hasta que t1 sea igual a b (la placa retornada en el metodo)
                        t=t1;
                        for(int j=pilatemporal.cima;j>=1;j--){
                            push(pilatemporal.pop());
                            System.out.println("Si");
                        }
                    }
                    else{
                        pilatemporal.push(t1);
                        System.out.println("push "+pilatemporal.cima);
                    }
                }
                return t;
            }
            else
                return null;
        }
        else
            System.out.println("Este vehiculo no esta en el estacionamiento");
        return null;
    }
    public nodoVehiculo pop(){
        nodoVehiculo t;//Se crea una variable t
        if(isVacia()==false){//Se comprueba si la pila esta vacia
            t=this.ultimo;//Se le asigna a t el valor dentro de ultimo
            this.ultimo=this.ultimo.siguiente;//Se le asigna al penultimo nodo el valor del ultimo
            this.cima=this.cima-1;//Se va recorriendo la pila
            return t;//Se retorna el valor del vehiculo sacado
        }
        else
            System.out.println("No se puede realizar un pop a la PILA");
        return null;
        //Si la pila esta vacia se imprime lo de arriiba y se retorna nulo
    }
    public nodoVehiculo existePlaca(String p){
        nodoVehiculo t=ultimo;
        for(int i=cima;i>=1;i--){
            if(t.getPlacas()==p){
                return t;
            }
            t=t.siguiente;
        }
        return null;
    }
    public boolean isVacia(){
        if(this.cima==0)
            return true;
        else 
            return false;
    }
    public void imprimir(){
        nodoVehiculo t=ultimo;
        if(cima==0){
            System.out.println("No hay vehiculos");
        }
        for(int i=cima;i>=1;i--){
            System.out.println("Placas del vehiculo: "+t.getPlacas()+" Hora entrada: "+t.getHe());
            t=t.siguiente;
        }
    }
}




