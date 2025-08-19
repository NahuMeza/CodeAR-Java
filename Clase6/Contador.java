package Clase6;

public class Contador extends Persona {

    Contador(int edad, String name, double altura){
        super(edad,name,altura);
    }
    public void contarGuita(){
        System.out.println("Cuento guita");
    }
}
