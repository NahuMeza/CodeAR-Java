public class Ejercicios {
    public static void main(String[] args) {
        int numero = 10;
        boolean esPar = numero % 2 == 0;

        while(esPar && (numero < 50)){
            numero += 2;
        }
    }
}
