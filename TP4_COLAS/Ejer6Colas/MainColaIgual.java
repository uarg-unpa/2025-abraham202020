package TP4_COLAS.Ejer6Colas;

//import java.util.Scanner;

public class MainColaIgual {

    public static void main(String [] args){

    // Aqui se crean los objetos de la cola

        ColaIgual c1 = new ColaIgual();
        ColaIgual c2 = new ColaIgual();

    // aqui le decimnos que tenemos que hacer a la cola

        c1.insertar(1);
        c1.insertar(2);
        c1.insertar(3);
        c2.insertar(1);
        c2.insertar(2);
        c2.insertar(3);


        if (c2.sonIguales(c1))
                System.out.println("son iguales");
        else 
                System.out.println("no son iguales");

            System.out.println("c1: ");
            
            while (!c1.estaVacia()) {
                System.out.print(c1.borrar() + " | ");
            }

        System.out.println();
            
            System.out.println("c2: ");

            while (!c2.estaVacia()) {
                System.out.print(c2.borrar() + " | ");
            }
    }
    
}
