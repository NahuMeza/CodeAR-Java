package Clase8;

public class Suma extends Operacion{
    Suma(int a, int b){
        super(a,b);
    }

    public int operacion_particular(){
        return this.a + this.b;
    }
}