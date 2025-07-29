import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class StackQueue {
    public static void main(String[] args) {
        // Cola (FIFO)
        Queue<String> cola = new LinkedList<>();
        cola.add("1era persona");
        cola.add("2da persona");
        System.out.println(cola.peek()); // visualizamos primer elemento
        String personaAAtender = cola.remove(); // devolver y eliminar el primer elemento
        System.out.println(personaAAtender);
        System.out.println(cola.peek()); // cual sigue
        System.out.println("\n");
        // Stack (LIFO)
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println(pila.peek());
        System.out.println(pila.pop());
        System.out.println(pila.peek());
    }    
}
