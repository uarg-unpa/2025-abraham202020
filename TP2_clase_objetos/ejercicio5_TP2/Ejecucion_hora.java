package TP2_clase_objetos.ejercicio5_TP2;

public class Ejecucion_hora {
    
    public static void main(String[] args) {
        Hora h1 = new Hora(14, 30, 45);  // válido
        Hora h2 = new Hora(25, 61, 10);  // inválido, será 00:00:00

        System.out.println("Hora 1: " + h1.mostrarHora());
        System.out.println("Hora 2: " + h2.mostrarHora());

//---------------------------------------------------------------------
        
        Hora h = new Hora(12, 15, 30);

        System.out.println("Hora inicial: " + h.mostrarHora());

        h.setHora(18);
        h.setMinutos(45);
        h.setSegundos(50);

        System.out.println("Hora modificada: " + h.mostrarHora());

        h.setHora(25); // inválida, no cambia
        h.setMinutos(70); // inválido
        h.setSegundos(-5); // inválido

        System.out.println("Hora final: " + h.mostrarHora());



    }
}

