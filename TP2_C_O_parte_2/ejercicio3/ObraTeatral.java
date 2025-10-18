package TP2_C_O_parte_2.ejercicio3;

public class ObraTeatral {


    // Atributos
    private String nombre;
    private double precio;

    // Constructor
    public ObraTeatral(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    // Método para mostrar información
    public String mostrarInfo() {
        return "Obra: " + nombre + " | Precio: $" + precio;
    }
}    
