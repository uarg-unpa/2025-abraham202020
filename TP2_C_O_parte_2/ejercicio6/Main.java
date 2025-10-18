package TP2_C_O_parte_2.ejercicio6;

public class Main {
 
     public static void main(String[] args) {
        ColeccionNumeros coleccion = new ColeccionNumeros(5); // arreglo con capacidad de 5

        coleccion.ingresarNumero(10);
        coleccion.ingresarNumero(20);
        coleccion.ingresarNumero(30);

        coleccion.mostrarNumeros();

        coleccion.vaciarArreglo();

        coleccion.mostrarNumeros();
    }
}
