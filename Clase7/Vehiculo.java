package Clase7;

abstract public class Vehiculo {
    private int ruedas;
    private int anioCreacion;
    private int cantidadAsientos;
    private boolean tienePuertas; 
    private String color = "Gris";

    Vehiculo(int ruedas1, int anioCreacion, int cantidadAsientos, boolean tienePuertas){
        this.ruedas = ruedas1;
        this.anioCreacion = anioCreacion;
        this.cantidadAsientos = cantidadAsientos;
        this.tienePuertas = tienePuertas;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void decirRuedas(){
        System.out.println(ruedas);
    }

    abstract public void bocina();
}
