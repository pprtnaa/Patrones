/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones;

import java.util.Observable;
import java.util.Observer;

/**
 * 
 * @author Alex Gomez
 */
public class ObservadorEspecifico implements Observer {
    public ArrayA listaA;
    public Operacion tipoOperacion;
    
    public ObservadorEspecifico(ArrayA lisA,Operacion op){
        this.listaA = (ArrayA)lisA;
        this.tipoOperacion = op;
    }

    @Override
    public void update(Observable o, Object o1) {
        this.listaA.setOperacion(tipoOperacion);
        this.listaA.ejecutarOperacion();
    }

}
