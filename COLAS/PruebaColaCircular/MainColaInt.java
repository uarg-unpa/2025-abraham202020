package COLAS.PruebaColaCircular;

public class MainColaInt {
    
    public static void main(String [] args){

    // Aqui se crea la cola

        ColaInt c = new ColaInt();

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

/* 

Explicacion:
    c.insertar(); agrega un dato a la cola

    c.borrar(); elmina el primer dato que tiene la cola

    como la filosofia de de cola el primero que entra va a ser el primero en salir

*/