package TP4_COLAS.Ejer3Colas;

public class Cola {
    private String[] datos;
    private int finalCola;
    private int max;

    // Constructor
    public Cola(int capacidad) {
        max = capacidad;
        datos = new String[max];
        finalCola = 0;
    }

    // Devuelve true si está vacía
    public boolean estaVacia() {
        return finalCola == 0;
    }

    // Devuelve true si está llena
    public boolean estaLlena() {
        return finalCola == max;
    }

    // Inserta un elemento al final (no valida)
    public void encolar(String elemento) {
        datos[finalCola] = elemento;
        finalCola++;
    }

    // Elimina y devuelve el primer elemento (no valida)
    public String desencolar() {
        String elemento = datos[0];
        // Correr todos los elementos hacia adelante
        for (int i = 0; i < finalCola - 1; i++) {
            datos[i] = datos[i + 1];
        }
        finalCola--;
        return elemento;
    }
}

/* Ejercicio: 



*/