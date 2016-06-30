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
public class ArrayA {
    ArrayList<Integer> ArrayB;
    public int numero;
    public Operacion tipoOperacion;
    
    public void setOperacion(Operacion op){
        this.tipoOperacion = op;
    }
    
    public void ejecutarOperacion(){
        this.numero = this.tipoOperacion.realizarOperacion(ArrayB);
        System.out.println("la suma es " + numero);
    }
    
    public void listaB(ArrayList lisb){
        this.ArrayB = lisb;
    }

}
