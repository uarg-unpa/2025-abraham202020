package COLAS.Clase_Practica_Colas.PracticaColaCircular;

public class ColaFIFO {

//tenemos que crear una cola circula de enteros con MAX = 5

    private final int MAXCOLA = 5;
    private int [] elementos;
    private int frente, ultimo;

// El constructor de la COLA

    public ColaFIFO(){

        elementos = new int [MAXCOLA];

        frente = 0;
        ultimo = 0;
    }

    //definimos si esta vacia la COLA

        public boolean estaVacia(){

            return (ultimo == frente);
        }

    //definimos si esta llena la COLA

        public boolean estaLlena(){

            int sigUltimo = siguiente(ultimo);

		return (sigUltimo == frente);
        
        }

        private int siguiente(int subind) {
		
        if (subind == MAXCOLA -1)
		
                return 0;
		
            else
			
                return ++subind;
	    }


    // encolar (insertar un nuevo elemento)
    public void insertar(int elem) {
        if (estaLlena()) {
            System.out.println("La cola está llena. No se puede encolar " + elem);
        } else {
            ultimo = siguiente(ultimo);
            elementos[ultimo] = elem;
        }
    }

    // desencolar (eliminar y devolver el frente)
    public int borrar() {
        int aux = -1;
        if (estaVacia()) {
            System.out.println("La cola está vacía. No se puede desencolar.");
        } else {
            frente = siguiente(frente);
            aux = elementos[frente];
        }
        return aux;
    }

    public int verFrente() {
    if (estaVacia()) {
        return -1; // valor simbólico si está vacía
    }
    int pos = siguiente(frente);
    return elementos[pos];
}

public void mostrarElementos() {
    if (estaVacia()) {
        System.out.println(" La cola está vacía.");
        return;
    }

    System.out.print(" Elementos en la cola: ");
    int i = frente;

    while (i != ultimo) {
        i = siguiente(i);
        System.out.print(elementos[i] + " ");
    }

    System.out.println();
    }

}