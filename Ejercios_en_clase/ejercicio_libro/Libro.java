package Ejercios_en_clase.ejercicio_libro;


public class Libro {

//atributos

    private String titulo;
    private String autor;
    private Editorial editorial;
    private int paginas;

//contructor

    public Libro(String titulo, String autor, Editorial editorial, int paginas){

        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;

    }

//get y set.

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setautor(String autor){
        this.autor = autor;
    }
//------------------------------------------
    public String getAutor(){
        return autor;
    }    
//------------------------------------------
    public void setEditorial(Editorial editorial){
        this.editorial = editorial;
    }

    public Editorial getEditorial(){
        return editorial;
    }    
//------------------------------------------

    public void setPaginas(int paginas){
        this.paginas = paginas;
    }

    public int getPaginas(){
        return paginas;
    }    
//------------------------------------------

    //metodos mas complejos

    public boolean esReciente(int anio){

        if (anio >= 2025){
            return true;
        } else {
            return false;
            }
    }

        public void cambiarEditorial(String N_editorial){

            editorial.setNombre(N_editorial);

        }

        public int contarPaginasEstimadas(){

                int paginas_Estimadas = 300;
                return (int) Math.ceil((double) paginas / paginas_Estimadas);
        }

        //libro.contarPaginasEstimadas()
        public String toString(){
        
            return "[" + this.titulo + "] [" + this.autor + "] [" + this.editorial +  "]";

        }



}
/*consigna: Registro de un libro crea una clase Libro con atributos: titulo, autor y 
editorial (objeto de clase Editorial con nombre y año). Puedes agregar atributos si 
lo consideras necesario, incluye constructor completo, método esReciente() (boolean, 
determina la condición para que sea reciente), un método cambiarEditorial() (void, 
para actualizar la editorial), un método contarPaginasEstimada() (int, 
determina como calcularlo), y toString. En main, usa Scanner 
para leer los datos de al menos dos libros (pueden crear más) e 
invoca los métodos para verificar si son recientes, cambiar la 
editorial y contar paginas estimadas.
*/