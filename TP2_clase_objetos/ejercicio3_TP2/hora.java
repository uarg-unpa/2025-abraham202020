package TP2_clase_objetos.ejercicio3_TP2;

public class hora {

    //atributos

    private int hora, minutos, segundos;

    //constructor

    public hora(){
    
        hora = 0; minutos = 0; segundos = 0;
    }

    public void setHora(int h){
        hora = h;
    }

    public void setMinutos(int m){
        
        minutos = m;
    }

    public void setSegundos(int s){

        segundos = s;
    }

    public void imprimirHora(){

        System.out.println( hora + " : " + minutos + " : " + segundos);
    }

    public int getHora(){

        return hora;
    }

    public int getMinutos(){

        return minutos;
    }

    
}
