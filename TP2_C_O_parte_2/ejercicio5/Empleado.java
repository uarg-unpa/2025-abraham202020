package TP2_C_O_parte_2.ejercicio5;

public class Empleado {

     // Atributos
    private int legajo;
    private double sueldoBase;
    private double pagoHoraExtra;
    private int horasExtra;
    private boolean casado;
    private int hijos;

    // Constructor
    public Empleado(int legajo, double sueldoBase, double pagoHoraExtra, int horasExtra, boolean casado, int hijos) {
        this.legajo = legajo;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        this.horasExtra = horasExtra;
        this.casado = casado;
        this.hijos = hijos;
    }

    // 1. Cálculo del complemento por horas extra
    public double calcularComplementoHorasExtra() {
        return pagoHoraExtra * horasExtra;
    }

    // 2. Cálculo del sueldo bruto
    public double calcularSueldoBruto() {
        return sueldoBase + calcularComplementoHorasExtra();
    }

    // 3. Cálculo de retenciones
    public double calcularRetenciones() {
        double porcentaje = 0.0;

        if (casado) {
            porcentaje += 10; // 10% si está casado
        }

        porcentaje += hijos; // +1% por cada hijo

        return (sueldoBase * porcentaje) / 100.0;
    }

    // Métodos para mostrar datos
    public void mostrarInfo() {
        System.out.println("Empleado Legajo: " + legajo);
        System.out.println("Sueldo Base: $" + sueldoBase);
        System.out.println("Pago por Hora Extra: $" + pagoHoraExtra);
        System.out.println("Horas Extra: " + horasExtra);
        System.out.println("Casado: " + (casado ? "Sí" : "No"));
        System.out.println("Hijos: " + hijos);
        System.out.println("Complemento Horas Extra: $" + calcularComplementoHorasExtra());
        System.out.println("Sueldo Bruto: $" + calcularSueldoBruto());
        System.out.println("Retenciones: $" + calcularRetenciones());
        System.out.println("Sueldo Neto: $" + (calcularSueldoBruto() - calcularRetenciones()));
    }


}
