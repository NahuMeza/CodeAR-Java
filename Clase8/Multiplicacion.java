package Clase8;

public class Multiplicacion extends Operacion{
    Multiplicacion(int a, int b){
        super(a,b);
    }
    public int operacion_particular(){
        return this.a * this.b;
    }
}
