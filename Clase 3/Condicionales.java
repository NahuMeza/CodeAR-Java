public class Condicionales {
    public static void main(String[] args){
        // Ejemplo 1
        int a = 2;
        int b = 0;
        int resultado = 0;
        if(b == 0){
            System.err.println("no se puede dividir por 0");
        }
        else{
            resultado = a / b;
        }
        System.err.println(resultado);
        // Ejemplo 2
        int numero = 14;

        if(numero > 6){
            System.out.println("El numero es mayor que 6");
        }
        else if(numero < 6){
            System.out.println("El numero es menor que 6");
        }
        else{
            System.out.println("El numero es 6");
        }
        // Ejemplo 3
        int res = 0;
        int num1 = 2;
        int num2 = -3;

        res = (num2 > 0) ? num1+num2 : num1-num2;

        if((num2 > 0) || (num1>0)){
            res = num1 + num2;
        }
        else{
            res = num1 - num2;
        }

        System.out.println(res);
        int tecla = 12;
        switch (tecla) {
            case 1:
                System.out.println("es 1");
                break;
            case 10:
                System.out.println("Es 10");
                break;
            case 12:
                System.out.println("Es 12");
                break;
            default:
                break;
        }
    }
}
