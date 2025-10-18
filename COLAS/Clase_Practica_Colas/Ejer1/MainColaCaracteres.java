package COLAS.Clase_Practica_Colas.Ejer1;

import java.util.Scanner;

public class MainColaCaracteres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaCaracteres cola = new ColaCaracteres(10);
        char opcion;
        boolean salir = false;

        do {
            System.out.println("\n--- MENÚ COLA DE CARACTERES ---");
            System.out.println("1. Encolar un comando");
            System.out.println("2. Desencolar un comando");
            System.out.println("3. Mostrar frente (peek)");
            System.out.println("4. Mostrar estado de la cola");
            System.out.println("5. Mostrar contenido completo");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.next().charAt(0);

            switch (opcion) {
                case '1':
                    if (!cola.estaLlena()) {
                        System.out.print("Ingresa un carácter: ");
                        char c = sc.next().charAt(0);
                        cola.encolar(c);
                    } else {
                        System.out.println("La cola está llena.");
                    }
                    break;

                case '2':
                    char desencolado = cola.desencolar();
                    if (desencolado != '\0')
                        System.out.println("Desencolado: " + desencolado);
                    break;

                case '3':
                    char frente = cola.peek();
                    if (frente != '\0')
                        System.out.println("Frente de la cola: " + frente);
                    break;

                case '4':
                    System.out.println("¿Vacía? " + cola.estaVacia());
                    System.out.println("¿Llena? " + cola.estaLlena());
                    break;

                case '5':
                    cola.mostrarCola();
                    break;

                case '6':
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (!salir);

        sc.close();
    }    

}