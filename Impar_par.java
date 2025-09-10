public class Impar_par {
    public static void main(String[] args) {
        System.out.println(Impar_par(6));
    }    
    public static int Impar_par(int number) { 
        
        if (number % 2 == 0) {
            System.out.println("Este numero eh par");
        }
        else {
            System.out.println("Este numero eh impar");
        }
        return number;
    }
    
}