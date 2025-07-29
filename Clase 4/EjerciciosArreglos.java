public class EjerciciosArreglos {
    public static void main(String[] args) {
        // Crear arreglo de 5 elementos numericos
        // Imprimir la suma de esos elementos

        int[] numericos = {10,11,12,13,14};

        int suma = 0;
        
        for(int i = 0; i < numericos.length; i++){
            suma += numericos[i];
        }
        System.out.println(suma);
        // Con el mismo arreglo, imprimir verdadero si se encuentra el numero 12 en el arreglo.
        boolean encuentra = false;
        for (int i = 0; i < numericos.length; i++) {
            if (numericos[i] == 12) {
                encuentra = true;
                break;
            }
        }

        System.out.println(encuentra);
    }
}

    

