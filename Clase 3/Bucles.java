public class Bucles {
    public static void main(String[] args){
        int i = 0;
        int res = 0;
        // While
        while(i != 5){
            // 1era ejecucion: i = 0, res = 0
            // 2da ejecucion: i = 1, res = 0
            // 3era ejecucion: i = 2, res = 1
            // 4ta ejecucion: i = 3, res = 3
            // 5ta ejecucion: i = 4, res = 6
            // 6ta ejecucion: i = 5, res = 10
            res += i;
            i++;
            System.out.println("se ejecuto");
        }
        // Cascadia Code
        // Do, While
        do{
            System.out.println("LLegue");
            res += i;
            i++;
        } while(i < 5); // => === >= <=
        // For
        for(int j = 0; j < 5; j++){
            res += j;
        }
        System.out.println(res); // expected: res = 10
    }
}
