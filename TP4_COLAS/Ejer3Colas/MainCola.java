package TP4_COLAS.Ejer3Colas;

import java.util.Scanner;

public class MainCola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cola cola = new Cola(5);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE COLA ---");
            System.out.println("1. Encolar");
            System.out.println("2. Desencolar");
            System.out.println("3. Mostrar cola");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    if (cola.estaLlena()) {
                        System.out.println("La cola está llena. No se puede encolar.");
                    } else {
                        System.out.print("Ingrese un elemento: ");
                        String elem = sc.nextLine();
                        cola.encolar(elem);
                        System.out.println("Elemento encolado correctamente.");
                    }
                    break;

                case 2:
                    if (cola.estaVacia()) {
                        System.out.println("La cola está vacía. No se puede desencolar.");
                    } else {
                        String desencolado = cola.desencolar();
                        System.out.println("Elemento desencolado: " + desencolado);
                    }
                    break;

                case 3:
                    if (cola.estaVacia()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        // Crear una estructura auxiliar para mostrar sin perder datos
                        Cola aux = new Cola(5);
                        System.out.println("Elementos en la cola:");
                        while (!cola.estaVacia()) {
                            String elem = cola.desencolar();
                            System.out.println(elem);
                            aux.encolar(elem); // se guarda en la auxiliar
                        }
                        // restaurar los elementos a la cola original
                        while (!aux.estaVacia()) {
                            cola.encolar(aux.desencolar());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
