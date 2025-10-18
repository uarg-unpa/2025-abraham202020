package PILAS.PRUEBA_DE_PILA.PilaInt;


public class PilaReales {
    
    private double[] elementos; // Array para almacenar los elementos
    private int cima;           // Índice del último elemento insertado
    private final int MAX = 10; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public PilaReales() {
        elementos = new double[MAX];
        cima = -1; // Pila vacía
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        return cima == -1;
    }

    // Verifica si la pila está llena
    public boolean estaLlena() {
        return cima == MAX - 1;
    }

    // Inserta un elemento en la pila
    public void meter(double dato) {
        if (!estaLlena()) {
            elementos[++cima] = dato;
            System.out.println("Se metió: " + dato);
        } else {
            System.out.println("La pila está llena, no se puede meter más elementos.");
        }
    }

    // Saca un elemento de la pila
    public double sacar() {
        if (!estaVacia()) {
            double dato = elementos[cima--];
            System.out.println("Se sacó: " + dato);
            return dato;
        } else {
            System.out.println("La pila está vacía, no se puede sacar.");
            return -1; // valor indicador
        }
    }

   //consejo: NO se debe mostrar el contenido de la pila en la clase:
    
    // Muestra el contenido de la pila
 /*    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Contenido de la pila:");
            for (int i = cima; i >= 0; i--) {
                System.out.println(elementos[i]);
            }
        }
    }
*/
 
    
}