package TP2_C_O_parte_2.ejercicio1;

import java.util.Scanner;

public class Ejecucion {

    public static void main(String [] args){

    Scanner sc = new Scanner (System.in);
    
    //objeto P1
    System.out.println("ingrese los datos de la primera persona: ");

    //registro de nombre

    System.out.println("ingrese su nombre: ");
    String nombre = sc.nextLine();

    //registro de edad

    System.out.println("ingrese su edad: ");
    int edad = sc.nextInt();

    //registro de dni

    System.out.println("ingrese su dni: ");
    int dni = sc.nextInt();

    //registro de sexo

    System.out.println("ingrese su sexo: ");
    char sexo = sc.next().charAt(0);
    

    //registro de peso

    System.out.println("ingrese su peso: ");
    double peso = sc.nextDouble();

    //registro de altura

    System.out.println("ingrese su altura: ");
    double altura = sc.nextDouble();

        // Limpieza del buffer
        sc.nextLine();

    //creando el objeto " persona 1 "
        Persona P1 = new Persona(nombre,edad,dni,sexo,peso,altura);
        

    //creando el objeto " persona 2 "

    //registro de nombre
    System.out.println("---------------------------");
    System.out.println("ingrese su nombre: ");
    nombre = sc.nextLine();    
    

        Persona P2 = new Persona(nombre);
        
    //creando el objeto " persona 3 "

    //registro de nombre

    System.out.println("---------------------------");
    System.out.println("ingrese su nombre: ");
    nombre = sc.nextLine();    


        Persona P3 = new Persona();

        System.out.println("mostrando los datos de la persona 1");
        System.out.println(P1.toString());
        System.out.println(P1.esMayorDeEdad());

        //----------------------------------------
        System.out.println("mostrando los datos de la persona 2");
        System.out.println(P2.toString());
        
    
        //----------------------------------------
        System.out.println("mostrando los datos de la persona 3");
        System.out.println(P3.toString());

//    System.out.println(P2.toString());

        sc.close();
    }
    
}
