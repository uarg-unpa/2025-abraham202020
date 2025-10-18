package COLAS.Ejercicio_ColaInt;

public class ColaInt {

    private int[] elementos;

    private int frente;
    private int fin;
    private final int MAX = 10;

    public ColaInt(){

        elementos = new int[MAX];

        frente = 0;

        fin = 0;

    }

    public boolean estaVacia(){

        return fin == 0; // vacia si no se ha encolado nada
    }

    public boolean estaLlena(){

        return fin == MAX; //llena si fin llega al final
    }

    public void encolar(int elem){

        elementos[fin] = elem;

        fin++; // Avanza linealmente
    }

    public int desencolar(){

        int aux = elementos [frente];

        for (int i=0; i < fin - 1; i++){

            elementos[i] = elementos[i+1];

        }

        fin --;

        return aux;

    }

    public int frente() {

        if (!estaVacia()){

            return elementos [frente];
        }

        System.out.println("La cola esta vacia");
        return -1;
    }

}