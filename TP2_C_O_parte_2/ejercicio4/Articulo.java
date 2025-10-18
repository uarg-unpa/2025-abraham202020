package TP2_C_O_parte_2.ejercicio4;

public class Articulo {

      // Atributos
    private String descripcion;
    private double precio;
    private String codigo;
    private int stock;

    // Constructor
    public Articulo (String descripcion, double precio, String codigo, int stock) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigo = codigo;
        this.stock = stock;
    }

    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    // Operaciones sobre el stock
    public void incrementarStock(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println("Stock incrementado en " + cantidad + ". Stock actual: " + stock);
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }
    }

    public void decrementarStock(int cantidad) {
        if (cantidad > 0) {
            if (cantidad <= stock) {
                stock -= cantidad;
                System.out.println("Stock decrementado en " + cantidad + ". Stock actual: " + stock);
            } else {
                System.out.println("No hay suficiente stock para decrementar.");
            }
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }
    }

    // Mostrar información del artículo
    public String mostrarInfo() {
        return "Artículo: " + descripcion + " | Código: " + codigo + " | Precio: $" + precio + " | Stock: " + stock;
    }



}
