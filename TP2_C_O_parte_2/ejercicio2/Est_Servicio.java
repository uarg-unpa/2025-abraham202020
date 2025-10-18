package TP2_C_O_parte_2.ejercicio2;

public class Est_Servicio {
 

    // Atributos
    private final int CAPACIDAD_MAX = 10000; 
    private int litrosActuales;

    // Constructor
    public Est_Servicio(int litrosIniciales) {
        if (litrosIniciales > CAPACIDAD_MAX) {
            this.litrosActuales = CAPACIDAD_MAX;
        } else if (litrosIniciales < 0) {
            this.litrosActuales = 0;
        } else {
            this.litrosActuales = litrosIniciales;
        }
    }

    // Método para cargar combustible (disminuir)
    public void cargar(int litros) {
        if (litros <= 0) {
            System.out.println("Cantidad inválida para cargar.");
            return;
        }
        if (litros > litrosActuales) {
            System.out.println("No hay suficiente combustible en la estación.");
        } else {
            litrosActuales -= litros;
            System.out.println("Se cargaron " + litros + " litros.");
        }
        verificarCapacidad();
    }

    // Método para reponer combustible (aumentar)
    public void reponer(int litros) {
        if (litros <= 0) {
            System.out.println("Cantidad inválida para reponer.");
            return;
        }
        if (litrosActuales + litros > CAPACIDAD_MAX) {
            litrosActuales = CAPACIDAD_MAX;
            System.out.println("La estación está llena (10.000 litros).");
        } else {
            litrosActuales += litros;
            System.out.println("Se repusieron " + litros + " litros.");
        }
    }

    // Método para verificar si queda poco combustible
    private void verificarCapacidad() {
        if (litrosActuales < 10) {
            System.out.println("⚠ ATENCIÓN: El nivel de combustible es crítico (" + litrosActuales + " litros).");
        }
    }

    // Getter
    public int getLitrosActuales() {
        return litrosActuales;
    }
}
