import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> arreglo = new ArrayList<>(); // Crearlo
        arreglo.add(1); // Asignar
        System.out.println(arreglo.get(0));
        arreglo.add(12);
        System.out.println(arreglo.size()); //  longitud
    }    
}
