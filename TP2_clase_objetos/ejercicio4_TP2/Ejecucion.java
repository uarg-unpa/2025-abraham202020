package TP2_clase_objetos.ejercicio4_TP2;

public class Ejecucion {
    
    public static void main (String [] args){

    //establecemos los datos de los atributos

        Televisor T1 = new Televisor ("Tele de tubo", false, 45, 20);
        Televisor T2 = new Televisor ("Plasma", true, 62, 30);

    //Esto es para mostrar los set y los get

    System.out.println("marca: " + T1.getMarca());
    System.out.println("Encendido: " + T1.getEncendido());
    System.out.println("Canal: " + T1.getCanal());
    System.out.println("volumen: " + T1.getVolumen());
    System.out.println("-------------------------------");
    
    System.out.println("marca: " + T2.getMarca());
    System.out.println("Encendido: " + T2.getEncendido());
    System.out.println("Canal: " + T2.getCanal());
    System.out.println("volumen: " + T2.getVolumen());
    System.out.println("-------------------------------");
    
    // Los otros metodos
    
    T1.encender();
    T1.subirVolumen();
    T1.cambiarCanal(5);
    T1.bajarCanal();
    T1.bajarVolumen();
    T1.apagar();

    System.out.println("-------------------------------");


    T2.apagar();
    T2.bajarVolumen();
    T2.subirCanal();
    T1.cambiarCanal(23);
    T2.subirVolumen();
    T2.encender();

    }

}
