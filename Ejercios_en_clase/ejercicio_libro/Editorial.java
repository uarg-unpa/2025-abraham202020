package Ejercios_en_clase.ejercicio_libro;

public class Editorial {
    
    private String nombre;
    private int anio;

    public Editorial(String nombre, int anio)
        {
            this.nombre = nombre;
            this.anio = anio;
        }


    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

    //--------------------------------

    public void setAnio(int anio){
    this.anio = anio;
    }

    public int getAnio(){
        return anio;
    }

}

