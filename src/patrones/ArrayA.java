/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones;

import java.util.ArrayList;
import java.util.Observable;

/**
 * 
 * @author Alex Gomez
 */
public class ArrayA extends Observable {
    public ArrayList<Integer> ArrayB;
    public Operacion tipoOperacion;

    
    public void setOperacion(Operacion op){
        this.tipoOperacion = op;
    }
    public void ejecutarOperacion(){
        this.tipoOperacion.realizarOperacion(ArrayB);
    }
    
    public void agregarListaB(ArrayList lisb){
        this.ArrayB = lisb;
        setChanged();
        notifyObservers();
    }

}
