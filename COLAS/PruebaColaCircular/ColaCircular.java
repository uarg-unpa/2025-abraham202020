package COLAS.PruebaColaCircular;

public class ColaCircular {
    
    private final int maxcola = 5;
    private int frente, ultimo;
    private int elementos [];

// El constructor 
    public ColaCircular (){

        elementos = new int [maxcola];
        
    // esta vacia
        frente = 1;
        ultimo = -1;
    }

    public boolean estaVacia(){

        return ((ultimo == -1)&&(frente ==-1));
    }

    public boolean estaLlena(){

        int sigUltimo = siguiente(ultimo);
        return (sigUltimo == frente);
    }

    private int siguiente (int subind){

        int siguiente;
        if (subind == maxcola-1) {
            siguiente = 0;
        } else {

            siguiente = subind + 1;            
        }
            return siguiente;
    }

    public void insertar(int elem){

        if(estaVacia()){

            frente = 0;
            ultimo = 0;
        
            elementos [ultimo] = elem;
        
        } else {

            if (!estaLlena()){

                ultimo = siguiente (ultimo);
                elementos [ultimo] = elem;
            }

        }
    }

public int borrar() {
    int dato = Integer.MIN_VALUE;
    if (frente == ultimo) {
        dato = elementos[frente];
        frente = -1;
        ultimo = -1;
    }
    else {
        if (!estaVacia()) {
            dato = elementos[frente];
            frente = siguiente(frente);
        }
    }
    return dato;
}



/* 

otra forma de metodo borrar 

    public int borrar() {
    int eliminado;

    if (estaVacia()) {
        System.out.println("Cola vacía, no se puede borrar.");
        return -1; // o lanzar una excepción
    } else {
        eliminado = elementos[frente];

        // Caso 1: había un solo elemento
        if (frente == ultimo) {
            frente = -1;
            ultimo = -1;
        } else {
            // Caso 2: más de un elemento → avanzar el frente circularmente
            frente = siguiente(frente);
        }
    }

    return eliminado;
}
*/
}
