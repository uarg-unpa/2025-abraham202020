package COLAS.PruebaColaCircular;

public class ColaInt {

    private final int maxcola = 5;
    private int [] elementos;
    private int ultimo;
    private final int frente = 0;

    public ColaInt() {

        elementos = new int [maxcola];
        ultimo = -1;
    }

    public boolean estaVacia(){

        return (ultimo == -1);
    }

    public boolean estaLlena(){

        return (ultimo == maxcola - 1);
    }

    public void insertar (int e){

        if (!estaLlena()){

            ultimo++;
            elementos[ultimo] = e;
        }
    }
    
    public int borrar(){

        int aux;
        int i = 0;
        aux = elementos[frente];

        while (i < ultimo){

            elementos [i] = elementos [i+1];
            i++;
        }

        ultimo--;
        return aux;
    }
}