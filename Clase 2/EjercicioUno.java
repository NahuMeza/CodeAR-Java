// 1- crear una variable de tipo int, double, String y boolean
// 2- Modificar la variable de tipo 'int' y sumarle un numero cualquiera
// 3- Verificar si ese numero es par y guardarla en una nueva variable llamada esPar
// 4- Imprimir el resultado de comparar con el operador '&&' 
// la variable boolean del principio y la nueva

public class EjercicioUno{
    public static void main(String[] args){
        // Ejercicio 1
        int entero = 12;
        double piMas = 99.4;
        String hola = "Hola Mundo";
        boolean boom = false; //false
        // Ejercicio 2
        // entero = entero + 22;
        entero += 22;
        // Ejercicio 3
        boolean esPar = (entero % 2) == 0;
        // Ejercicio 4
        boolean fly = false;

        System.out.println(!boom && esPar && !fly);
    
    }

}
