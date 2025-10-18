package TP2_clase_objetos.ejercicio6_TP2;

public class Fecha {
    
    // Atributos
    private int dia;
    private int mes;
    private int anio;

    // ===============================
    // a) Constructor con validación
    // ===============================
    public Fecha(int dia, int mes, int anio) {
        if (fechaValida(dia, mes, anio)) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        } else {
            // Si la fecha es inválida -> 01/01/2013
            this.dia = 1;
            this.mes = 1;
            this.anio = 2013;
        }
    }

    // Método para validar fecha
    private boolean fechaValida(int d, int m, int a) {
        if (m < 1 || m > 12) return false;
        if (d < 1 || d > diasEnMes(m, a)) return false;
        return true;
    }

    // Días por mes (considera años bisiestos en febrero)
    private int diasEnMes(int m, int a) {
        switch (m) {
            case 2:
                if (esBisiesto(a)) return 29;
                else return 28;
            case 4: case 6: case 9: case 11: return 30;
            default: return 31;
        }
    }

    private boolean esBisiesto(int a) {
        return (a % 400 == 0) || (a % 4 == 0 && a % 100 != 0);
    }

    // ===============================
    // b) Métodos para devolver día, mes y año
    // ===============================
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    // ===============================
    // c) Métodos para cambiar día, mes y año
    // ===============================
    public void setDia(int dia) {
        if (fechaValida(dia, this.mes, this.anio)) {
            this.dia = dia;
        }
    }

    public void setMes(int mes) {
        if (fechaValida(this.dia, mes, this.anio)) {
            this.mes = mes;
        }
    }

    public void setAnio(int anio) {
        if (fechaValida(this.dia, this.mes, anio)) {
            this.anio = anio;
        }
    }

    // ===============================
    // d) Obtener nombre del mes
    // ===============================
    public String getNombreMes() {
        String[] nombres = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                            "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"};
        return nombres[mes - 1];
    }

    // ===============================
    // e) Mostrar la fecha en formato solicitado
    // ===============================
    public String mostrarFecha() {
        return dia + " de " + getNombreMes() + " de " + anio;
    }

    // Método main para probar
    public static void main(String[] args) {
        // Fecha válida
        Fecha f1 = new Fecha(1, 9, 2012);
        System.out.println(f1.mostrarFecha()); // 1 de Setiembre de 2012

        // Fecha inválida
        Fecha f2 = new Fecha(32, 13, 2020);
        System.out.println(f2.mostrarFecha()); // 1 de Enero de 2013

        // Uso de getters
        System.out.println("Día: " + f1.getDia());
        System.out.println("Mes: " + f1.getMes());
        System.out.println("Año: " + f1.getAnio());

        // Uso de setters
        f1.setDia(15);
        f1.setMes(12);
        f1.setAnio(2025);
        System.out.println(f1.mostrarFecha()); // 15 de Diciembre de 2025
    }
}



