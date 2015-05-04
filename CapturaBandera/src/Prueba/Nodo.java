package Prueba;

import java.util.ArrayList;

/**
 * Created by Hankyx on 04/05/2015.
 */
public class Nodo {
    Nodo padre;
    ArrayList<Nodo> hijos;
    int x, y;

    public Nodo getPadre(){
        return padre;
    }

    public ArrayList<Nodo> getHijos(){
        return hijos;
    }
}
