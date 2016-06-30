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
public class Patrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayA listaA = new ArrayA();
        listaA.setOperacion(new Suma());
        ArrayList<Integer> listab = new ArrayList();
        listab.add(2);
        listab.add(2);
        listaA.listaB(listab);
        listaA.ejecutarOperacion();
        
    }
    
}
