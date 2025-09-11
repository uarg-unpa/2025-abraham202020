package Ejercios_en_clase.ejercicio_libro;

import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
    
//creacion del objeto editorial.

    System.out.println("Ingrese el nombre de la editorial");
    String nombreEdit = sc.nextLine();

    System.out.println("Ingrese el año de la editorial");
    int anioEdit =sc.nextInt();

    System.out.println("===========================================");

    Editorial edit1 = new Editorial (nombreEdit,anioEdit);

    System.out.println("Datos de la editorial: ");
    System.out.println(edit1.toString());

    System.out.println("===========================================");
//-------------------------------------------------------------------
//Limpieza del buffer
        sc.nextLine();
//objeto 1 para el libro
    System.out.println("Ingrese los datos del primer libro");
    
    System.out.println("===========================================");

    System.out.println("Ingrese el nombre del libro");
    String titulo = sc.nextLine();

    //-------------------------------------------------------------------

    System.out.println("Ingrese el nombre del autor");
    String autor = sc.nextLine();

    //-------------------------------------------------------------------
    
    System.out.println("Ingrese el año del libro");
    int anio =sc.nextInt();

    System.out.println("Ingrese la cantidad de paginas");
    int paginas =sc.nextInt();

    Libro lib1 = new Libro(titulo,autor,edit1,anio,paginas);

    System.out.println("===========================================");

    System.out.println("Datos del libro: ");
    System.out.println(lib1.toString());

    System.out.println("===========================================");

    System.out.println("===========================================");
    System.out.println("Estimación de páginas:");
    System.out.println(lib1.contarPaginasEstimadas());

    sc.close();    

    }

}
