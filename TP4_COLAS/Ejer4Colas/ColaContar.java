package TP4_COLAS.Ejer4Colas;

public class ColaContar {
 
    private int frente, ultimo;
    private int elementos [];
    private final int MaxCola = 5;

    public ColaContar (){

        elementos = new int [MaxCola];
        frente = -1;
        ultimo = -1;

        // esta vacia.
    }

    public boolean estaVacia (){

        return ((ultimo == -1)&&(frente == -1));
    }

    public boolean estaLlena(){

        int sigultimo = siguiente (ultimo);
        return (sigultimo == frente);

    }

    private int siguiente (int subind){

        int siguiente;

        if (subind == MaxCola -1){

            siguiente = 0;

        } else {

            siguiente = subind + 1;
        }

        return siguiente;

    }

    public void insertar (int elem){

        if (estaVacia()) {

            frente = 0;
            ultimo = 0;

            elementos [ultimo] = elem;
        
        } else {

            if (!estaLlena()){

                ultimo = siguiente(ultimo);
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

            } else {

                if (!estaVacia()) {
                    dato = elementos[frente];
                    frente = siguiente(frente);
                    }
                }
                return dato;
            }

    // Metodo para contar            

        public int contar() {
                
            ColaContar aux = new ColaContar();
            int c = 0;

        while (!this.estaVacia()) {
            
            aux.insertar(this.borrar());
            c = c + 1;
        }
        
        while (!aux.estaVacia()) {
            
            this.insertar(aux.borrar());
        }
        
        return c;
    }





    }



/* Ejercicio:

    En base a la implementación Frente y Final movible, escribir un método contar que devuelva la 
    cantdad de elementos en la cola. Nota: no olvidar que, si bien la cola se implementa como un arreglo, 
    no debería manejarse como tal.  
 
*/
