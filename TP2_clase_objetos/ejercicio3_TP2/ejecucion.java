package TP2_clase_objetos.ejercicio3_TP2;

public class ejecucion {

        public static void main(String[] args) {        
        
    // Punto A
        /*
        hora h1 = new hora();
        h1.setHora(0);
        h1.setMinutos(23);
        h1.imprimirHora();
        */

    // Punto B

        /* 
        hora h1, h2;
        h1 = new hora();
        h1.setHora(9);
        h1.setMinutos(23);
        h1.imprimirHora();
        h2 = new hora();
        h2.setHora(8);
        h2.setMinutos(0);
        h2.imprimirHora();
        System.out.println(h1.getHora());
        */

    // Punto C

    /* 
        hora h1, h2, h3;
        
        int valor;
        int aux;
        
        h1 = new hora();
        h2 = new hora();
        h3 = new hora();

        System.out.println(h2.getHora());
        h1.setHora(3);
        h1.setMinutos(4);
        h2.setHora(11);
        h2.setSegundos(23);
        h3.setHora(5);
        h3.setSegundos(22);

        valor = h1.getMinutos();
        aux = h2.getHora();        
        h1.imprimirHora();
        h2.imprimirHora();
        h3.imprimirHora();

        //los h1.imprimirHora(); sirven para que aparezcan las horas, minutos y segundos en la pantalla.

        System.out.println(valor);
        System.out.println(aux);
        System.out.println(h3.getHora());
        
        //para usar un "h3.getHora()" debe estar dentro de un "System.out.println();"

        */

    // Punto D

        hora h1, h2;
        h1 = new hora();
        h2 = new hora();

        h1.setHora(12);
        h1.setMinutos(0);

        h2.setHora(17);
        h2.setMinutos(30);

        h1.imprimirHora();

        System.out.println(h2.getHora() + ":" + h2.getMinutos());
    }
    
}
