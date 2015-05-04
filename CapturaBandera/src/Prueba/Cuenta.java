package Prueba;

import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;

/**
 * Created by Hankyx on 04/05/2015.
 */
public class Cuenta extends CyclicBehaviour{
    int contador=0;
    public void action(){
        contador=contador+1;
        System.out.println("Contador " + contador);
    }
}
