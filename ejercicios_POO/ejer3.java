
package ejercicios_POO;

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