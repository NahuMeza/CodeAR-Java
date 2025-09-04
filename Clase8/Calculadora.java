package Clase8;

public class Calculadora {
    private int resultado;
    
    private Operacion op;

    public int suma(int a, int b){
        op = new Suma(a, b);
        return op.operacion_particular();
    }

    public int resta(int a, int b){
        op = new Resta(a, b);
        return op.operacion_particular();
    }
    
    public int multiplicacion(int a, int b){
        op = new Multiplicacion(a,b);
        return op.operacion_particular();
    }

    public int division(int a, int b){
        op = new Division(a,b);
        return op.operacion_particular();
    }
}
