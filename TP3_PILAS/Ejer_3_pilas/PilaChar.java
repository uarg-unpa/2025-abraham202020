package TP3_PILAS.Ejer_3_pilas;

public class PilaChar {    

    private char[] elementos; 
    private int cima;
    private final int MAX = 12; //Esta es la capacidad maxima de la pila


    //El constructor: inicializa el array y la cima

        public PilaChar(){

            elementos = new char[MAX];
            cima = -1; // se inicia con menos uno para que este completamente vacio, ya que el cero cuenta como espacio
        }

    //metodos

    // sirve para verificar si la pila esta vacia
    public boolean estaVacia(){
        return cima == -1;

    }

    // sirve para Verificar si la pila está llena
    public boolean estaLlena() {
        return cima == MAX - 1;

    }

    // Agrega un elemento en la cima (push)
    
    public void meter(char elem) {
        if(!estaLlena()){

            elementos[++cima] = elem;
            System.out.println("Se metio: " + elem);
            
        } else {

            System.out.println("La pila está llena, no se puede meter más elementos.");
        }
    }

    public char sacar(){

        if (!estaVacia()) {

            char elem = elementos [cima--];
            System.out.println("Se saco: " + elem);
            return elem;

        } else {

            System.out.println("La pila está vacía, no se puede sacar.");
            return '\0'; // devuelve caracter nulo
        }
    }
}

