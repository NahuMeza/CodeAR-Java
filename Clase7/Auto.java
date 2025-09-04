package Clase7;

public class Auto extends Vehiculo{
    boolean tieneCola;
    String nombre;

    Auto(int anioCreacion, int cantidadAsientos, boolean tieneCola){
        super(4, anioCreacion, cantidadAsientos, true);
        this.tieneCola = tieneCola;
    }

    @Override
    public void bocina(){
        System.out.println("pipi");
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
