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
public class Resta implements Operacion{
    private int numero;

    @Override
    public int realizarOperacion(ArrayList lista) {
        lista.stream().forEach((lista1)-> {
            numero =  (Integer)lista1 - numero;
        });
        
        System.out.println("El resultado de la resta es " + numero);
        return numero;
        
    }

}
