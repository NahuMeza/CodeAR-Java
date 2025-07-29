import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {
        int[] arreglo = new int[15]; // crear arreglo
        arreglo[0] = 12; // asignar valor
        arreglo[1] = 7;
        System.out.println(arreglo[0]);
        arreglo[0] = 10;
        System.out.println(arreglo[0]);
        int longitud = arreglo.length;
        System.out.println(longitud);
        // arreglo[0] = 0;
        // arreglo[1] = 2;
        // arreglo[2] = 4;
        // arreglo[3] = 6;
        // arreglo[4] = 8;
        for(int i = 0; i < arreglo.length;i++){
            // i = 0 -> arreglo[0] = 0*2 = 0
            // i = 1 -> arreglo[1] = 1*2 = 2
            // i = 2 -> arreglo[2] = 2*2 = 4
            // ...
            // i = 14 -> arreglo[14] = 14*2 = 28
            // i = 15 -> x
            arreglo[i] = i*2;
        }
        System.out.println(Arrays.toString(arreglo));
        int[] arregloDeUna = {1,2,3};
    }
    
}