package TP3_PILAS.Ejer_3_pilas;

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
    }    
}



/* 
 public class TestInversa {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.println("Ingrese una palabra: ");
        String palabra = p.nextLine();

        System.out.println("Mostras la Inversa: ");
        for(int i = palabra.length() - 1;i >= 0; i--){
            System.out.println(palabra.charAt(i));
        }
        p.close();
    }
}
*/