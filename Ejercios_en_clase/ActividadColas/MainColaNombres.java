package Ejercios_en_clase.ActividadColas;

import java.util.Scanner;

public class MainColaNombres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaNombres cola = new ColaNombres(8);
        char opcion;
        boolean salir = false;

        do {
            System.out.println("\n--- MENÚ COLA DE NOMBRES ---");
            System.out.println("1. Encolar un nombre");
            System.out.println("2. Desencolar un nombre");
            System.out.println("3. Mostrar nombre en el frente (peek)");
            System.out.println("4. Mostrar estado de la cola");
            System.out.println("5. Mostrar contenido completo");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.next().charAt(0);
            sc.nextLine(); // Limpia buffer

            switch (opcion) {
                case '1':
                    if (!cola.estaLlena()) {
                        System.out.print("Ingresa un nombre: ");
                        String nombre = sc.nextLine();
                        cola.encolar(nombre);
                    } else {
                        System.out.println("La cola está llena.");
                    }
                    break;

                case '2':
                    String desencolado = cola.desencolar();
                    if (desencolado != null)
                        System.out.println("Desencolado: " + desencolado);
                    break;

                case '3':
                    String frente = cola.peek();
                    if (frente != null)
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
