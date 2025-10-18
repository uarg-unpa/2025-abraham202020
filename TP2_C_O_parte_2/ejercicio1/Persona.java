package TP2_C_O_parte_2.ejercicio1;

public class Persona {
    
    //atributos 
    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    //constructor 

    //Constructor por defecto (Sin ningun tipo de valores).

    public Persona (){

        this.nombre = "";
        this.edad = 0;
        this.dni = 0;
        this.sexo = ' '; // Por defecto hombre
        this.peso = 0.0;
        this.altura = 0.0;
    }
    
    // Constructor con nombre
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Constructor con todos los atributos
    public Persona(String nombre, int edad, int dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        
        //este segmento en los atributos lo ponemos para poder hacer que la clase sea privada
        if (comprobarSexo(sexo)){
            this.sexo = sexo;
        }else{

            sexo = ' ';
        }
        //si el dato ingresado es incorrecto solo saldra vacio.
        this.peso = peso;
        this.altura = altura;
    }    
    

    //metodos set y get y metodos comunes.

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

//------------------------------------
    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

//------------------------------------
    public void setDni(int dni){
        this.dni = dni;

    }
    public int getDni(){
        return dni;
    }

//------------------------------------
    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public char getSexo(){
        return sexo;
    }

//------------------------------------    

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getPeso(){
        return peso;
    }
//------------------------------------

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }
//------------------------------------


    //si es mayor de edad devuelve booleano
        public boolean esMayorDeEdad(){
            
            if (edad >= 18){

            //System.out.println("Es mayor de edad");
            return true;
        
            } else {

            //System.out.println("Es menor de edad");
            return false;
           }
        }
//no hace falta imprimir un mensaje.        


/*        if (this.edad < 13){
            System.out.println("es un niño");
        } else if (this.edad < 18) {
            System.out.println("es un adolecente");
        } else {
            System.out.println("es un adulto");
            }
        }
*/
    //comprueba si el sexo introducido es correcto
        private boolean comprobarSexo(char sexo){

            //aqui solo pueden ser validas las letras H y F, sino dara false.
        if (sexo == 'H' || sexo == 'F'){

            //System.out.println("sexo valido: " + sexo);
            return true;

        } else {

            //System.out.println("sexo invalido. pruebe con H o F ");
            return false;
            }

        }

    public String toString(){
        return "[" + this.nombre + "] [" + this.edad + "] [" + this.dni + "] [" + this.sexo + "] [" + this.peso + "] [" + this.altura + "]";

    }
}
