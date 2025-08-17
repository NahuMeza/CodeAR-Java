public class Ejercicios {
    // restar dos numeros y retornar el resultado: - que valor devuelve? - que parametros tiene?
    // es proceso o funcion?
    // es funcion
    public static int restaDe2(int a, int b){
        int resultado = a - b;
        return resultado;
    }
    
    public static boolean esPar(int n){
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int restaDe2 = restaDe2(2, 4); // como se llamaria de manera correcta?
        // ejercicio2 - sobrecargar el metodo para que tambien podamos
        // restar 2 floats.
        // ---------------------
        // este codigo determina si un numero es par o impar, modularizarlo.
        // fuera del modulo
        System.out.println(esPar(13));
        // ejercicio - escribir un proceso que devuelva una lista de opciones (no funcional)
        
        listaOpciones();
    
    }

    public static void listaOpciones(){
        System.out.println("Opcion uno: blabla \n" + 
                            "Opcion dos: bla bla \n" + 
                            "Opcion tres: bla bla bla");

    }

    //sobrecarga
    public static float restaDe2(float a, float b){
        return a - b;
    }

}
