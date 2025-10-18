package TP2_clase_objetos.ejercicio2_TP2;

public class alumno {

    //La declaracion de atributos:

    private String nombre;
    private String apellido;
    private int edad;
    private int matricula;
    private String carrera;
    private double promedio;

    //el constructor: 

    public alumno(String nombre, String apellido, int edad, int matricula, String carrera, double promedio){

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.matricula = matricula;
        this.carrera = carrera;
        this.promedio = promedio;

    }

    //metodos set y get

    public void setNombre(String n){
        nombre = n;
    }

    public String getNombre(){
        return nombre;
    }
    public void setApellido(String a){
        apellido = a;
    }

    public String getApellido(){
        return apellido;
    }

    public void setEdad(int e){
        edad = e;
    }

    public int getEdad(){
        return edad;
    }

    public void setMatricula(int m){
        matricula = m;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setCarrera(String c){
        carrera = c;
    }

    public String getCarrera(){
        return carrera;
    }
    
    public void setPromedio(double p){
        promedio = p;
    }

    public double getPromedio(){
        return promedio;
    }


    //metodos

    public void estudiar(){

        System.out.println(nombre + " esta estudiando.");
    }

    public void rendirExamen(double nota){

        promedio = (promedio + nota) / 2;
        System.out.println(nombre + " rindio examen, nuevo promedio: " + promedio);

    }

    //el main

    public static void main(String[] args){

        //creamos un objeto alumno
                                                                                                                                
        alumno alu1 = new alumno("martin", "lopez", 17, 2234, "ingenieria", 9.5 );

        //mostramos los datos 

        System.out.println("Nombre: " + alu1.getNombre());
        System.out.println("Apellido: " + alu1.getApellido());
        System.out.println("Edad: " + alu1.getEdad());
        System.out.println("Matricula: " + alu1.getMatricula());
        System.out.println("Carrera: " + alu1.getCarrera());
        System.out.println("Promedio: " + alu1.getPromedio());

        //ejecutamos metodos

        alu1.estudiar();
        alu1.rendirExamen(9);
        

    }


    
}

/* 
en la declaracion de atributos ponemos todos los atributos que creamos sobre la clase
en este caso para crear un atributo tenemos que hacer lo siguiente:
    colocamos el "private" luego ponemos "el tipo de dato" y por ultimo el atributo.

    por ejemplo: private String nombre;


en el constructor vamos crear un "public" con el "nombre de la clase" en este caso va a ser "alumno"
dentro del () pondremos los atributos, si estan dentro del () se van a llamar como parametros
lo ultimo que tenemos que hacer es colocar un "this." mas el atributo por ejemplo: "this.matricula = matricula"

*/
