package TP2_clase_objetos.ejercicio2_TP2;

public class cancion {
    
    //establecemos los atributos

    private String titulo;
    private String artista;
    private double duracion;
    private String genero;
    private String album;

    //la creacion de nuestro constructor

    public cancion (String titulo, String artista, double duracion, String genero, String album){

        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = genero;
        this.album = album;

    }

    //metodos set y get

    public void setTitulo (String t){
        titulo = t;
    }

    public String getTitulo(){
        return titulo;
    } 

    public void setArtista (String a){
        artista = a;
    }

    public String getArtista(){
        return artista;
    }     

    public void setDuracion (double d){
        duracion = d;
    }

    public double getDuracion(){
        return duracion;
    }     

    public void setGenero (String g){
        genero = g;
    }

    public String getGenero(){
        return genero;
    } 

    public void setAlbum (String bum){
        album = bum;
    }

    public String getAlbum(){
        return album;
    }     

    //metodos mas elaborados


    //el main

        public static void main(String[] args){

            //la creacion de primer objeto "can1"

            cancion can1 = new cancion ("Bohemian Rhapsody", "Queen", 5.55 , "rock" , "A Night at the Opera");

        System.out.println("titulo: " + can1.getTitulo());
        System.out.println("artista: " + can1.getArtista());
        System.out.println("duracion: " + can1.getDuracion());
        System.out.println("genero: " + can1.getGenero());
        System.out.println("album: " + can1.getAlbum());
        
        }

}
