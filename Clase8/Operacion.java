package Clase8;

abstract class Operacion {
    protected int a;
    protected int b;

    Operacion(int a, int b){
        this.a = a;
        this.b = b;
    }

    public abstract int operacion_particular();
}