package TP4_COLAS.Ejer4Colas;


public class MainColaContar {

     public static void main(String [] args){

    // Aqui se crea la cola

        ColaContar c = new ColaContar();

    // aqui le decimnos que tenemos que hacer a la cola

        c.insertar(1);
        c.insertar(2);
        c.insertar(3);
        c.borrar();
        c.insertar(4);

        int n = c.contar();
        System.out.println("cantidad: " + n);
        c.borrar();

        while (!c.estaVacia()){

            System.out.print(c.borrar() + " | ");
        }

    }
}

/* 
 int n = c.contar();
System.out.println("cantidad: " + n);
c.borrar();

System.out.println("cantidad: " + c.contar());
while (!c.estaVacia()) {
    System.out.print(c.borrar() + "|");
}
  
*/