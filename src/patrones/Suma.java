/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones;

import java.util.ArrayList;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Suma implements Operacion{
    private int numero = 0;
    @Override
    public int realizarOperacion(ArrayList lista) {
        for (Object lista1 : lista) {
                numero = numero + (Integer)lista1; 
            }
        
        return numero;
    } 

}
