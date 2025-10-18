package TP2_clase_objetos.ejercicio6_TP2;

public class TestFecha {

    public static void main(String[] args) {

        // Crear dos fechas
        Fecha f1 = new Fecha(10, 5, 2018);   // 10 de Mayo de 2018
        Fecha f2 = new Fecha(25, 12, 2022);  // 25 de Diciembre de 2022

        // Probar los métodos
        System.out.println("Primera fecha: " + f1.mostrarFecha());
        System.out.println("Segunda fecha: " + f2.mostrarFecha());

        System.out.println("Día de f1: " + f1.getDia());
        System.out.println("Mes de f2: " + f2.getNombreMes());

        // Comparar cuál tiene mayor año
        Fecha mayor;
        if (f1.getAnio() > f2.getAnio()) {
            mayor = f1;
        } else if (f2.getAnio() > f1.getAnio()) {
            mayor = f2;
        } else {
            mayor = null; // si tienen el mismo año
        }

        // Mostrar el resultado en formato dd/mm/aaaa
        if (mayor != null) {
            System.out.println("La fecha con mayor año es: " +
                String.format("%02d/%02d/%d", mayor.getDia(), mayor.getMes(), mayor.getAnio()));
        } else {
            System.out.println("Ambas fechas tienen el mismo año: " + f1.getAnio());
        }
    }
}