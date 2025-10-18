package TP2_C_O_parte_2.ejercicio4;

public class Main {
    
 public static void main(String[] args) {
        // Crear artículo
        Articulo articulo = new Articulo("Mouse Gamer", 1500, "M123", 10);

        // Mostrar info inicial
        System.out.println(articulo.mostrarInfo());

        // Operaciones con stock
        articulo.decrementarStock(3);
        articulo.incrementarStock(5);
        articulo.decrementarStock(20); // caso sin stock suficiente

        // Mostrar info final
        System.out.println(articulo.mostrarInfo());
    }

}
