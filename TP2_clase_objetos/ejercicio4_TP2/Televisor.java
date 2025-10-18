package TP2_clase_objetos.ejercicio4_TP2;

public class Televisor {

    private String marca;
    private boolean encendido;
    private int canal;
    private int volumen;

    //creamos el constructor con public + "Nombre la clase"

    public Televisor (String marca, boolean encendido, int canal, int volumen){

        this.marca = marca;
        this.encendido = encendido;
        this.canal = canal;
        this.volumen = volumen;

    }

    //metodos set y get.

    public void setMarca (String marca){
        this.marca = marca;
    } 
     
    public String getMarca(){
        return this.marca;
    }
//------------------------------------------    

    public void setEncendido (boolean encendido){
        this.encendido = encendido;
    } 
     
    public boolean getEncendido(){
        return this.encendido;
    }
//------------------------------------------

        public void setCanal (int canal){
        this.canal = canal;

        } 
     
        public int getCanal(){
            return this.canal;
        }    
//------------------------------------------        

        public void setVolumen (int volumen){
        this.volumen = volumen;
        } 
     
        public int getVolumen(){
            return this.volumen;
        }

        //metodos comunes
    
        public boolean encender(){

            System.out.println("televisor encendido");
            return true;
        }

        public boolean apagar(){
            
            System.out.println("televisor apagado");
            return false;
        }

        public int subirCanal(){

            if (encendido){

                canal++;
                System.out.println("subiendo el canal: " + canal);
            }
            return canal;
        }

        public int bajarCanal(){

        if (encendido){

            canal--;
            System.out.println("bajando el canal: " + canal);
            }
        return canal;
        }

        public int subirVolumen(){

        if (volumen < 100){

            volumen++;
            System.out.println("subiendo el volumen: " + volumen);
            }  
            return volumen;

        }

        public int bajarVolumen(){

        if (volumen >= 0){

            volumen--;
            System.out.println("bajando el volumen: " + volumen);
            }  
            return volumen;

        }        

        // void sirve para no tener que usar un return en el "public void".
        // en el "public int" si o si necesitas un return.

        public int cambiarCanal(int nuevoCanal){

        if (nuevoCanal > 0 && nuevoCanal <=100){

            canal= nuevoCanal;
            System.out.println("cambiando canal: " + canal);
            
        } else {

            System.out.println("canal invalido");

            }
            return canal;

        }                

}

//signos:   >  <    

// mayor igual >=    

//menor igual <=