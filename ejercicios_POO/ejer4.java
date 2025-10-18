package ejercicios_POO;

import java.util.Scanner;

public class ejer4 {
 
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
    
        System.out.println("ingrese 3 numeros enteros");

        int nro1, nro2, nro3, mayor;

        nro1 = sc.nextInt();
        nro2 = sc.nextInt();
        nro3 = sc.nextInt();

        if (nro1 > nro2 && nro1 > nro3){
            mayor = nro1;

        } else 
            if (nro2 > nro1 && nro2 > nro3){
                mayor = nro2;
        } else {
            mayor = nro3;
        }

        System.out.println("El mayor es: " + mayor);
    
    sc.close();

    }        

}
