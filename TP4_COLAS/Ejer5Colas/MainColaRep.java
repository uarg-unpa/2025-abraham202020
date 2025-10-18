package TP4_COLAS.Ejer5Colas;

import java.util.Scanner;

public class MainColaRep {

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaRep cola = new ColaRep(10);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE COLA ---");
            System.out.println("1. Encolar");
            System.out.println("2. Desencolar");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Eliminar repetidos");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (cola.estaLlena()) {
                        System.out.println("La cola está llena.");
                    } else {
                        System.out.print("Ingrese un elemento: ");
                        String elem = sc.nextLine();
                        cola.encolar(elem);
                    }
                    break;

                case 2:
                    if (cola.estaVacia()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.println("Elemento desencolado: " + cola.desencolar());
                    }
                    break;

                case 3:
                    if (cola.estaVacia()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        ColaRep aux = new ColaRep(10);
                        System.out.println("Elementos en la cola:");
                        while (!cola.estaVacia()) {
                            String e = cola.desencolar();
                            System.out.println(e);
                            aux.encolar(e);
                        }
                        while (!aux.estaVacia()) {
                            cola.encolar(aux.desencolar());
                        }
                    }
                    break;

                case 4:
                    if (cola.estaVacia()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        cola.eliminarRepetidos();
                        System.out.println("Elementos repetidos eliminados.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
    
}