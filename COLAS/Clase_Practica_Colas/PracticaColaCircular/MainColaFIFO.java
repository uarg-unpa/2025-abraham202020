package COLAS.Clase_Practica_Colas.PracticaColaCircular;

import java.util.Scanner;

public class MainColaFIFO {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

    //creamos el primer objeto de cola.
    
        ColaFIFO c1 = new ColaFIFO();

    // definimos la variable opcion.

        int opcion;

    // Creamos el menu 

        do {
            System.out.println("\n=== MENÚ COLA CIRCULAR ===");
            System.out.println("1. Encolar (insertar número)");
            System.out.println("2. Desencolar (borrar número)");
            System.out.println("3. Ver frente de la cola");
            System.out.println("4. Mostrar estado de la cola");
            System.out.println("5. Mostrar todos los elementos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
    
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número: ");
                    int num = sc.nextInt();
                    if (c1.estaLlena()) {
                        System.out.println(" La cola está llena. No se puede encolar.");
                    } else {
                        c1.insertar(num);
                        System.out.println(" Elemento " + num + " encolado correctamente.");
                    }
                    break;

                case 2:
                    if (c1.estaVacia()) {
                        System.out.println(" La cola está vacía. No se puede desencolar.");
                    } else {
                        int borrado = c1.borrar();
                        System.out.println(" Elemento desencolado: " + borrado);
                    }
                    break;

                case 3:
                    if (c1.estaVacia()) {
                        System.out.println(" La cola está vacía. No hay frente.");
                    } else {
                        int frente = c1.verFrente();
                        System.out.println(" Elemento en el frente: " + frente);
                    }
                    break;

                case 4:
                    if (c1.estaVacia()) {
                        System.out.println(" Estado: vacía.");
                    } else if (c1.estaLlena()) {
                        System.out.println(" Estado: llena.");
                    } else {
                        System.out.println(" Estado: con espacio disponible.");
                    }
                    break;

                case 5:
                    c1.mostrarElementos();
                    break;

                case 0:
                    System.out.println(" Saliendo del programa...");
                    break;

                default:
                    System.out.println(" Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 0);

        sc.close();
    }    
    
}