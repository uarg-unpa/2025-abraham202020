package TP2_C_O_parte_2.ejercicio3;

public class Teatro {
    
        // Atributos
    private String nombre;
    private String direccion;
    private ObraTeatral[] obras; // Arreglo de 3 obras

    // Constructor
    public Teatro(String nombre, String direccion, ObraTeatral[] obras) {
        this.nombre = nombre;
        this.direccion = direccion;

        if (obras.length == 3) {
            this.obras = obras;
        } else {
            System.out.println("Un teatro debe tener exactamente 3 obras.");
            this.obras = new ObraTeatral[3];
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ObraTeatral[] getObras() {
        return obras;
    }

    public void setObra(int indice, ObraTeatral obra) {
        if (indice >= 0 && indice < 3) {
            obras[indice] = obra;
        } else {
            System.out.println("El teatro solo admite 3 obras (índices 0 a 2).");
        }
    }

    // Mostrar la info del teatro con todas sus obras
    public void mostrarInfo() {
        System.out.println("Teatro: " + nombre + " | Dirección: " + direccion);
        for (int i = 0; i < obras.length; i++) {
            if (obras[i] != null) {
                System.out.println("Obra " + (i+1) + ": " + obras[i].mostrarInfo());
            } else {
                System.out.println("Obra " + (i+1) + ": [Vacío]");
            }
        }
    }
}