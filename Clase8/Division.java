package Clase8;

public class Division extends Operacion{
    Division(int a, int b){
        super(a,b);
    }
    public int operacion_particular(){
        return this.a / this.b;
    }
}
