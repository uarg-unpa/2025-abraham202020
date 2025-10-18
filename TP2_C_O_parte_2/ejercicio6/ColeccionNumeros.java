package TP2_C_O_parte_2.ejercicio6;

public class ColeccionNumeros {
  
    private int[] numeros;
    private int indice; // para saber cuántos números hay cargados

    // Constructor
    public ColeccionNumeros(int capacidad) {
        numeros = new int[capacidad];
        indice = 0;
    }

    // Método para ingresar números
    public void ingresarNumero(int numero) {
        if (indice < numeros.length) {
            numeros[indice] = numero;
            indice++;
            System.out.println("Número " + numero + " ingresado.");
        } else {
            System.out.println("El arreglo está lleno. No se pueden ingresar más números.");
        }
    }

    // Método para mostrar números ingresados
    public void mostrarNumeros() {
        if (indice == 0) {
            System.out.println("No hay números en el arreglo.");
        } else {
            System.out.print("Números ingresados: ");
            for (int i = 0; i < indice; i++) {
                System.out.print(numeros[i] + " ");
            }
            System.out.println();
        }
    }

    // Método para vaciar el arreglo
    public void vaciarArreglo() {
        indice = 0; // se "resetea" la cantidad de elementos cargados
        System.out.println("El arreglo ha sido vaciado.");
    }
    

}
