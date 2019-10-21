/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAP;

/**
 *

 */
public class TDAPila {
    private Nodo cima;
    private int n;
    public TDAPila(){
        cima=null;
    }
    public boolean esVacia(){
        return cima==null;
    }
    public void apilar(Object item){
        Nodo nuevoNodo=new Nodo(item);
        if(esVacia()) cima=nuevoNodo;
        else{
            nuevoNodo.setSgteNodo(cima);
            cima=nuevoNodo;
        }n++;
    }
    public Object desapilar(){
        Object Aux=cima.getItem(); //toma a aquel item que vamos a desapilar
        if(esVacia()) return null;
        else{
            cima=cima.getSgteNodo();
            n--;
            return Aux;
        }
    }
    public Object ultimo(){
        if (esVacia()) return null;
        else return cima.getItem();
    }
    public int longitud(){
        return n;
    }
}
