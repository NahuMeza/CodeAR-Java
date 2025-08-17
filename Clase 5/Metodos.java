import Hola.Sumar;

public class Metodos {
    // metodo funcional
    public static int sumar(int a, int b){
        int resultado = a + b;
        return resultado;
    }

    // metodo - proceso
    public static void prettyPrint(int a){
        System.out.println("Mi numero es: " + a);
    }

    // sobrecarga
    public static int sumar(int a, int b, int c){
        return a + b + c;
    }

    public static void prettyPrint(String s){
        System.out.println("Mi texto dice: " + s);
    }

    public static void main(String[] args) {
        int resultadoSuma = sumar(2, 4);
        prettyPrint(resultadoSuma);
        prettyPrint("Hola");
    }
}
