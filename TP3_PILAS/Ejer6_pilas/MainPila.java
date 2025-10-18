package TP3_PILAS.Ejer6_pilas;

import java.util.Scanner;

public class MainPila {

    public static void main(String [] args){

        Scanner sc = new Scanner (System.in);
        PilaInt pila1 = new PilaInt();
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE PILA ===");
            System.out.println("1. Meter elemento");
            System.out.println("2. Sacar elemento");
            System.out.println("3. Obtener el segundo elemento desde la cima");
            System.out.println("4. Asignar a X el segundo elemento desde la cima (sin modificar la pila)");
            System.out.println("5. Asignar a X el N-ésimo elemento desde la cima (eliminando los N primeros)");
            System.out.println("6. Asignar a X el N-ésimo elemento desde la cima (sin modificar la pila)");
            System.out.println("7. Asignar a X el elemento del fondo (dejando la pila vacía)");
            System.out.println("8. Asignar a X el elemento del fondo (sin modificar la pila)");            
            System.out.println("9. Verificar estado (vacía/llena)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1: // Meter elemento
                    if (pila1.estaLlena()) {
                        System.out.println("Error: La pila está llena.");
                    } else {
                        System.out.print("Ingrese un número: ");
                        int num = sc.nextInt();
                        pila1.meter(num);
                        System.out.println("Elemento " + num + " agregado.");
                    }
                    break;
                
                    //------------------------------

                case 2: // Sacar elemento
                    if (pila1.estaVacia()) {
                        System.out.println("Error: La pila está vacía.");
                    } else {
                        int elemento = pila1.sacar();
                        System.out.println("Elemento sacado: " + elemento);
                    }
                    break;

                    //------------------------------

                case 3: // Obtener el segundo elemento desde la cima
                    if (pila1.estaVacia()) {
                        System.out.println("Error: La pila está vacía.");
                    } else {
                        pila1.sacar(); // quito el primero (no lo guardo)
                        if (pila1.estaVacia()) {
                            System.out.println("Error: No hay un segundo elemento en la pila.");
                        } else {
                            int X = pila1.sacar(); // guardo el segundo
                            System.out.println("El segundo elemento (asignado a X) es: " + X);
                        }
                    }
                    break;

                    //------------------------------

                case 4: // Ver el segundo elemento desde la cima sin modificar la pila
                    if (pila1.estaVacia()) {
                        System.out.println("Error: La pila está vacía.");
                    } else {
                        int primero = pila1.sacar(); // saco el de arriba
                        if (pila1.estaVacia()) {
                            System.out.println("Error: No hay un segundo elemento en la pila.");
                            pila1.meter(primero); // devuelvo el primero
                        } else {
                            int segundo = pila1.sacar(); // saco el segundo
                            int X = segundo;
                            System.out.println("El segundo elemento (asignado a X) es: " + X);

                            // Restaurar el estado original
                            pila1.meter(segundo);
                            pila1.meter(primero);
                        }
                    }
                    break;

                //------------------------------

                case 5: // Asignar a X el N-ésimo elemento desde la cima, eliminando los N primeros
                    if (pila1.estaVacia()) {
                        System.out.println("Error: La pila está vacía.");
                    } else {
                        System.out.print("Ingrese N (posición desde la cima): ");
                        int N = sc.nextInt();

                        if (N <= 0) {
                            System.out.println("N debe ser un entero positivo.");
                        } else {
                            int X = -1;
                            boolean valido = true;

                            for (int i = 1; i <= N; i++) {
                                if (pila1.estaVacia()) {
                                    System.out.println("La pila no tiene " + N + " elementos.");
                                    valido = false;
                                    break;
                                }
                                int elem = pila1.sacar();
                                if (i == N) {
                                    X = elem; // guardamos el N-ésimo
                                }
                            }

                            if (valido) {
                                System.out.println("El elemento número " + N + " (asignado a X) es: " + X);
                            }
                        }
                    }
                    break;

                //------------------------------

                case 6: // Asignar a X el N-ésimo elemento desde la cima sin modificar la pila
                    if (pila1.estaVacia()) {
                        System.out.println("Error: La pila está vacía.");
                    } else {
                        System.out.print("Ingrese N (posición desde la cima): ");
                        int N = sc.nextInt();

                        if (N <= 0) {
                            System.out.println("N debe ser un entero positivo.");
                        } else {
                            PilaInt aux = new PilaInt(); // pila auxiliar
                            int X = -1;
                            boolean valido = true;

                            for (int i = 1; i <= N; i++) {
                                if (pila1.estaVacia()) {
                                    System.out.println("La pila no tiene " + N + " elementos.");
                                    valido = false;
                                    break;
                                }
                                int elem = pila1.sacar();
                                aux.meter(elem);
                                if (i == N) {
                                    X = elem; // el N-ésimo
                                }
                            }

                            // Restaurar los elementos en la pila original
                            while (!aux.estaVacia()) {
                                pila1.meter(aux.sacar());
                            }

                            if (valido) {
                                System.out.println("El elemento número " + N + " (asignado a X) es: " + X);
                            }
                        }
                    }
                    break;

                    //------------------------------                    

                    case 7: // Asignar a X el elemento fondo de la pila, dejando la pila vacía
                        if (pila1.estaVacia()) {
                            System.out.println("Error: La pila está vacía.");
                        } else {
                            int X = -1;
                            while (!pila1.estaVacia()) {
                                X = pila1.sacar(); // al final este será el fondo
                            }
                            System.out.println("El elemento del fondo (asignado a X) es: " + X);
                            System.out.println("La pila ahora está vacía.");
                        }
                        break;

                    //------------------------------                        

                        case 8: // Asignar a X el elemento del fondo sin modificar la pila
                            if (pila1.estaVacia()) {
                                System.out.println("Error: La pila está vacía.");
                            } else {
                                PilaInt aux = new PilaInt();
                                int X = -1;

                                // Pasar todo a la auxiliar
                                while (!pila1.estaVacia()) {
                                    int elem = pila1.sacar();
                                    aux.meter(elem);
                                    X = elem; // el último que saco será el fondo
                                }

                                // Restaurar en la pila original
                                while (!aux.estaVacia()) {
                                    pila1.meter(aux.sacar());
                                }

                                System.out.println("El elemento del fondo (asignado a X) es: " + X);
                                System.out.println("La pila quedó intacta.");
                            }
                            break;

                    //------------------------------                            


                case 9: // Verificar estado
                    System.out.println("¿Vacía? " + pila1.estaVacia() + " | ¿Llena? " + pila1.estaLlena());
                    break;

                case 0: // Salir
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);    

        sc.close();
    }
    
}