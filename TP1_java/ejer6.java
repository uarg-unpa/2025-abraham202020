package TP1_java;

import java.util.Scanner;

public class ejer6 {
 
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
    
        System.out.println("ingrese los numeros enteros");

        int num1, num2, num3;

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        int suma, producto;
        
        producto = num1*num2*num3;
        suma = num1+num2+num3;

        System.out.println("la suma de los enteros es: " + suma);
        System.out.println("El producto de los enteros es: " + producto);

        
        sc.close();
    }

}
