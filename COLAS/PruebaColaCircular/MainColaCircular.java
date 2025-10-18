package COLAS.PruebaColaCircular;

public class MainColaCircular {

    public static void main(String [] args){

    // Aqui se crea la cola

        ColaCircular c = new ColaCircular();

    // aqui le decimnos que tenemos que hacer a la cola

        c.insertar(1);
        c.insertar(2);
        c.insertar(3);
        c.borrar();
        c.insertar(4);


        while (!c.estaVacia()){

            System.out.print(c.borrar() + " | ");
        }

    }
    
}