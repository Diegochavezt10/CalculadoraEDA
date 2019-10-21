/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAP;

/**
 *

 */
public class Nodo {
    
    private Object item;
    private Nodo sgteNodo;
    public Nodo(){
        item=null;
    }
    public Nodo(Object item){
        this.item=item;
    }
    public Nodo(Object item, Nodo sgteNodo){
        this.item=item;
        this.sgteNodo=sgteNodo;
    }
    public Object getItem() {
        return item;
    }
    public void setItem(Object item) {
        this.item = item;
    }
    public Nodo getSgteNodo() {
        return sgteNodo;
    }
    public void setSgteNodo(Nodo sgteNodo) {
        this.sgteNodo = sgteNodo;
    }
    @Override
    public String toString() {
        return item.toString();
    }
    
    
}
