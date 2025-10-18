package TP4_COLAS.Ejer5Colas;

public class ColaRep {
    
    private String[] datos;
    private int finalCola;
    private int max;

    // Constructor
    public ColaRep(int capacidad) {
        max = capacidad;
        datos = new String[max];
        finalCola = 0;
    }

    public boolean estaVacia() {
        return finalCola == 0;
    }

    public boolean estaLlena() {
        return finalCola == max;
    }

    public void encolar(String elemento) {
        datos[finalCola] = elemento;
        finalCola++;
    }

    public String desencolar() {
        String elemento = datos[0];
        for (int i = 0; i < finalCola - 1; i++) {
            datos[i] = datos[i + 1];
        }
        finalCola--;
        return elemento;
    }

    // 🧹 Método para eliminar elementos repetidos
    public void eliminarRepetidos() {
        ColaRep aux = new ColaRep(max); // cola auxiliar

        // Mientras haya elementos en la cola original
        while (!this.estaVacia()) {
            String actual = this.desencolar();

            // Verificar si ya existe en la cola auxiliar
            boolean repetido = false;
            int tamAux = aux.finalCola;

            for (int i = 0; i < tamAux; i++) {
                if (aux.datos[i].equals(actual)) {
                    repetido = true;
                    break;
                }
            }

            // Si no está repetido, lo guardamos en la auxiliar
            if (!repetido) {
                aux.encolar(actual);
            }
        }

        // Restaurar los elementos únicos a la cola original
        while (!aux.estaVacia()) {
            this.encolar(aux.desencolar());
        }
    }
}
