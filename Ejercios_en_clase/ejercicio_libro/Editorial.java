package Ejercios_en_clase.ejercicio_libro;

    public class Editorial {
    
        private String nombreEdit;
        private int anioEdit;

    public Editorial(String nombreEdit, int anioEdit)
        {
            this.nombreEdit = nombreEdit;
            this.anioEdit = anioEdit;
        }


    public void setNombreEdit(String nombreEdit){
        this.nombreEdit = nombreEdit;
    }
    public String getNombreEdit(){
        return nombreEdit;
    }

    //--------------------------------

    public void setAnioEdit(int anioEdit){
    this.anioEdit = anioEdit;
    }

    public int getAnioEdit(){
        return anioEdit;
    }

    //--------------------------------
        public String toString(){
        
            return "[" + this.nombreEdit + "] [" + this.anioEdit + "]";

        }
}

