package TP2_C_O_parte_2.ejercicio3;

public class Main {
 
    public static void main(String[] args) {
        // Crear obras
        ObraTeatral obra1 = new ObraTeatral("Hamlet", 500);
        ObraTeatral obra2 = new ObraTeatral("La Casa de Bernarda Alba", 400);
        ObraTeatral obra3 = new ObraTeatral("Romeo y Julieta", 450);

        // Crear teatro
        ObraTeatral[] obras = {obra1, obra2, obra3};
        Teatro teatro = new Teatro("Teatro Colón", "Av. 9 de Julio 1234", obras);

        // Mostrar información inicial
        teatro.mostrarInfo();

        System.out.println("\n--- Cambios ---");
        // Cambiar nombre del teatro
        teatro.setNombre("Teatro Nacional");

        // Cambiar nombre y precio de una obra
        obra1.setNombre("Otelo");
        obra1.setPrecio(550);

        // Mostrar nuevamente
        teatro.mostrarInfo();
    }
}