package Clase8;

public class Resta extends Operacion {
    Resta(int a, int b) { 
        super(a,b);
    }

    public int operacion_particular(){
        return this.a - this.b;
    }
}
