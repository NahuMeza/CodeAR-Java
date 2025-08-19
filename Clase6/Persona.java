package Clase6;

public class Persona {
    private int edad;
    final private int DNI = 45127823;
    private String nombre;
    private double altura;

    Persona(int edad, String nombre, double altura){
        this.edad = edad;
        this.nombre = nombre;
        this.altura = altura;
    }

    public int getEdad(){
        return edad;
    }
}
