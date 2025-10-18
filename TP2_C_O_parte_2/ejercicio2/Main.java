package TP2_C_O_parte_2.ejercicio2;

public class Main {
    
    public static void main(String[] args) {
        Est_Servicio estacion = new Est_Servicio(5000);

    System.out.println("==============================================");

        estacion.cargar(3000);   // Se cargan 3000 litros
        System.out.println("Litros actuales: " + estacion.getLitrosActuales());

    System.out.println("==============================================");        

        estacion.reponer(7000);  // Intenta reponer más de lo que cabe
        System.out.println("Litros actuales: " + estacion.getLitrosActuales());

    System.out.println("==============================================");

        estacion.cargar(9995);   // Lleva al nivel crítico
    }
}
