package COLAS.Clase_Practica_Colas.Ejer2;

public class ColaNombres {

    private String[] elementos; // Arreglo de nombres
    private int frente;         // Índice del primer elemento (más antiguo)
    private int fin;            // Índice del próximo lugar libre
    private int cantidad;       // Cantidad actual de elementos en la cola
    private final int MAX;      // Capacidad máxima

    // Constructor
    public ColaNombres(int capacidad) {
        this.MAX = capacidad;
        this.elementos = new String[capacidad];
        this.frente = 0;
        this.fin = 0;
        this.cantidad = 0;
    }

    // Verifica si la cola está vacía
    public boolean estaVacia() {
        return cantidad == 0;
    }

    // Verifica si la cola está llena
    public boolean estaLlena() {
        return cantidad == MAX;
    }

    // Encola un nuevo nombre (agrega al final)
    public void encolar(String nombre) {
        if (!estaLlena()) {
            elementos[fin] = nombre;
            fin = (fin + 1) % MAX; // Movimiento circular
            cantidad++;
        } else {
            System.out.println("La cola está llena. No se puede encolar más nombres.");
        }
    }

    // Desencola un nombre (el más antiguo)
    public String desencolar() {
        if (!estaVacia()) {
            String nombre = elementos[frente];
            elementos[frente] = null; // Limpia la posición
            frente = (frente + 1) % MAX; // Avanza circularmente
            cantidad--;
            return nombre;
        } else {
            System.out.println("La cola está vacía. No se puede desencolar.");
            return null;
        }
    }

    // Peek: muestra el nombre del frente sin eliminarlo (de forma segura)
    public String peek() {
        if (!estaVacia()) {
            // No accedemos directamente al array sin verificar antes
            return elementos[frente];
        } else {
            System.out.println("La cola está vacía. No hay elemento al frente.");
            return null;
        }
    }

    // Muestra el contenido de la cola en orden FIFO
    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.print("Cola: [ ");
            int indice = frente;
            for (int i = 0; i < cantidad; i++) {
                System.out.print(elementos[indice] + " ");
                indice = (indice + 1) % MAX;
            }
            System.out.println("]");
        }
    }    
   
}