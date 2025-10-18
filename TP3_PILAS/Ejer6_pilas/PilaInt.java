package TP3_PILAS.Ejer6_pilas;

public class PilaInt {

    private int [] elementos;
    private int cima;
    private final int MAX = 10; //la capacidad de la pila

    public PilaInt(){

        elementos = new int [MAX];
        cima = -1;
    }

    public boolean estaVacia(){
        if(cima == -1){

            return true;

        } else {

            return false;        
        }
    }

    public boolean estaLlena(){

        if(cima == MAX -1){

            return true;
            
        } else {

            return false;        
        }
    }

    public void meter(int elem) {

        if(!estaLlena()){

            elementos [++cima] = elem;
            System.out.println("se metio: "+ elem);
        } else {

            System.out.println("La pila está llena, no se puede meter más elementos.");        
        }
    }

    //----------------------------

    public int sacar() {
        
        if (estaVacia()) {
            System.out.println("Error: la pila está vacía, no se puede sacar elemento.");
            return -1;

        } else {

            int elem = elementos[cima];
            cima--; 
            return elem; 
         }

    }

}