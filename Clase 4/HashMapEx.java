import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        // HashMap (clave, valor)
        HashMap<String, Integer> diccionario = new HashMap<>();
        diccionario.put("Edad", 12);
        diccionario.put("Promedio", 8);
        System.out.println(diccionario.get("Promedio"));
        System.out.println(diccionario.size());
        //System.out.println(diccionario.);
    }
}
