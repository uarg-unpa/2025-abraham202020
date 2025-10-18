package TP1_java;

import java.util.Scanner;

public class ejer6B {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;
        int producto = 1;
        int suma = 0;
        int cont = 1;

        while (cont <= 3 )
        {
            System.out.println("ingrese un numero entero");
            num = sc.nextInt();

            suma = suma + num;
            producto = producto * num;
            cont = cont + 1;

        }
        
        System.out.println("la suma de los enteros es: " + suma);
        System.out.println("El producto de los enteros es: " + producto);

        sc.close();
    }
}
