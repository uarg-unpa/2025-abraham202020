package PILAS.PRUEBA_DE_PILA.PilaInt;

import java.util.Scanner;

public class MenuReales {
 
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaReales pila = new PilaReales();

        System.out.print("¿Cuántos elementos desea ingresar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número real: ");
            double num = sc.nextDouble();
            pila.meter(num);
        }
/* 
        pila.mostrar();

        System.out.println("\nSacando un elemento de la pila...");
        pila.sacar();

        pila.mostrar();
        
        sc.close();
    }
*/
        sc.close();
    }
}
