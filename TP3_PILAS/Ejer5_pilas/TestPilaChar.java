package TP3_PILAS.Ejer5_pilas;

public class TestPilaChar {
 
    public static void main (String [] args){

        PilaChar miPila = new PilaChar();
        String palabra = "programacion";

    for (int i = 0; i < palabra.length(); i++){
        if (!miPila.estaLlena())
            miPila.meter(palabra.charAt(i));
        
        else

        System.out.println("No ingresado: " + palabra.charAt(i));

        }

        System.out.println("Elemento en la cima es: " + miPila.elementoCima());

    }    

}
