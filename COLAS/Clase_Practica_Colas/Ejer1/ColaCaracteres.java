package COLAS.Clase_Practica_Colas.Ejer1;

public class ColaCaracteres {
    
    private char[] elementos; // Arreglo donde se guardan los caracteres
    private int finalCola;    // Índice del próximo lugar libre (final de la cola)
    private final int MAX;    // Capacidad máxima de la cola

    // Constructor
    public ColaCaracteres(int capacidad) {
        this.MAX = capacidad;
        this.elementos = new char[capacidad];
        this.finalCola = 0;
    }

    // Método para verificar si la cola está vacía
    public boolean estaVacia() {
        return finalCola == 0;
    }

    // Método para verificar si la cola está llena
    public boolean estaLlena() {
        return finalCola == MAX;
    }

    // Método para encolar (agregar un nuevo carácter al final)
    public void encolar(char c) {
        if (!estaLlena()) {
            elementos[finalCola] = c;
            finalCola++;
        } else {
            System.out.println(" La cola está llena. No se puede encolar más elementos.");
        }
    }

    // Método para desencolar (sacar el carácter más antiguo)
    public char desencolar() {
        if (!estaVacia()) {
            char frente = elementos[0];
            // Desplazamos todos los elementos hacia la izquierda
            for (int i = 0; i < finalCola - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            finalCola--;
            return frente;
        } else {
            System.out.println("La cola está vacía. No se puede desencolar.");
            return '\0'; // Retorna un carácter nulo
        }
    }

    // Método peek (muestra el elemento en el frente sin eliminarlo)
    public char peek() {
        // No accedemos directamente al array sin verificar
        if (!estaVacia()) {
            return elementos[0];
        } else {
            System.out.println("La cola está vacía. No hay elemento al frente.");
            return '\0';
        }
    }

    // Mostrar el contenido actual de la cola (ESTO NO DEBE IR AQUI, SOLO DEBE ESTAR EN EL MAIN)
    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.print("Cola: [ ");
            for (int i = 0; i < finalCola; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println("]");
        }
    }
}