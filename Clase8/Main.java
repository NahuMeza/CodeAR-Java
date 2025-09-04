package Clase8;

public class Main {
    public static void main(String[] args) {
        Calculadora calcu = new Calculadora();

        System.out.println("El resultado de sumar 2+2: " + calcu.suma(2, 2));

        System.out.println("El resultado de restar 2-2: " + calcu.resta(2, 2));
        
        System.out.println("El resultado de Multiplicacion 2*2: " + calcu.multiplicacion(2, 2));

        System.out.println("El resultado de divicion 2/2: " + calcu.division(2, 2));
    }
}
