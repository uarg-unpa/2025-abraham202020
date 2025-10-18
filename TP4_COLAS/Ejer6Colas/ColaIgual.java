package TP4_COLAS.Ejer6Colas;

public class ColaIgual {
 
    private final int maxcola = 5;
    private int [] elementos;
    private int ultimo;
    private final int frente = 0;

    public ColaIgual() {

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

        public boolean sonIguales(ColaIgual c) {
            boolean distintos = false; int valor;

            ColaIgual aux = new ColaIgual();

            while (!c.estaVacia() & !distintos) {
                valor = this.borrar();
            
                if (c.borrar() != valor)
                    distintos = true;
                aux.insertar(valor);
            }

            while (!this.estaVacia()) {
                aux.insertar(this.borrar());
            }


            while (!aux.estaVacia()) {
                this.insertar(aux.borrar());
            }
            return !distintos;
            }

}
