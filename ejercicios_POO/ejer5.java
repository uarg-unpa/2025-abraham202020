package ejercicios_POO;

import java.util.Scanner;

public class ejer5 {    
    
        public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

    System.out.println("ingrese un dia de la semana (L,M,I,J,S,D):");

    char dia;

        dia = sc.next().charAt(0);

    switch(dia){

        case 'L': {System.out.println("lunes");
        break;}

        case 'M': {System.out.println("martes");
        break;}

        case 'I': {System.out.println("miercoles");
        break;}

        case 'J': {System.out.println("jueves");
        break;}

        case 'V': {System.out.println("viernes");
        break;}

        case 'S': {System.out.println("sabado");
        break;}        

        case 'D': {System.out.println("domingo");
        break;}

        default: {
            System.out.println("dia no valido");
        break;}
        }
    sc.close();
    }


}
