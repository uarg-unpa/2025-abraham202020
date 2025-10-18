package TP2_clase_objetos.ejercicio5_TP2;

public class Hora {
    
    //atributos
    private int hora;
    private int minutos;
    private int segundos;

    //Constructor
    public Hora(int hora, int minutos, int segundos){
        if (esHoraValida(hora, minutos, segundos)){

            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;

        } else {
        
        // Si no es válida, se inicializa en 00:00:00

        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;

    }
} 

     // Método para validar la hora

    private boolean esHoraValida(int hora, int minutos, int segundos) {
           
        return (hora >= 0 && hora <= 23) && (minutos >= 0 && minutos <= 59) && (segundos >= 0 && segundos < 59);
    }


// ---------- Métodos para modificar los valores ----------

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida, no se cambió.");
        }
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        } else {
            System.out.println("Minutos inválidos, no se cambió.");
        }
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        } else {
            System.out.println("Segundos inválidos, no se cambió.");
        }
    }

    // Método para mostrar la hora en formato HH:MM:SS
    
    public String mostrarHora() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);


  // ---------- NUEVO MÉTODO ----------
    // Devuelve la hora en minutos

    
    


    }

 }



