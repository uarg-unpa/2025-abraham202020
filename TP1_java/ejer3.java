package TP1_java;

public class ejer3 {

    public static void main (String[] args){

        int A = 1;
        int B = 2;
        int C = 3;
        int aux; 
        
        System.out.println("valores iniciales: ");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);

        //intercambio de valores

        aux = C;
        B = A;
        C = A;
        A = aux;

        System.out.println("valores despues del intercambio: ");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);

    }    
}

/*Ejercicio: Se tienen 3 variables A, B y C enteras. Escribir un 
 algoritmo que intercambie entre si sus valores, para que queden 
 finalmente de la siguiente forma:

    B y C toman el valor de A.
    A toma el valor original de C 
    
Ejemplo: Si A tiene el valor 1, B tiene el valor 2, y C tiene el 
valor 3, entonces debería quedar B con 1, C con 1 y A con 3. 
Nota: sólo se debe utilizar una variable auxiliar como ayuda.*/