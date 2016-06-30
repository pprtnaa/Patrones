/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.util.ArrayList;

/**
 *
 * @author Alex Gomez
 */
public class Patrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayA listaA = new ArrayA();
        ArrayList<Integer> listab = new ArrayList();
        listab.add(2);
        listab.add(2);
        listab.add(4);
        listab.add(3);
        
        ObservadorEspecifico obA = new ObservadorEspecifico(listaA,new Suma());
        ObservadorEspecifico obB = new ObservadorEspecifico(listaA,new Resta());
        
        listaA.addObserver(obA);
        listaA.addObserver(obB);
        
        listaA.agregarListaB(listab);
        
    }
    
}
