
import java.util.Scanner;



public class Calculadora {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculadora simples");
        System.out.println("Digite o primeiro numero:");
        int N1 = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        int N2 = sc.nextInt();
        System.out.println("Qual a operacao /,*,-,+");
        String Op = sc.next();
        
        System.out.println(Calculadora(N1, N2, Op));
    }
    public static double Calculadora(int N1, int N2, String Op){
         double resultado = 0;
            switch (Op) {
            case "+":
                resultado = N1+N2;
                break;
            case "-":
                resultado = N1-N2;
                break;
            case "*":
                resultado = N1*N2;
                break;
            case "/":
                resultado = N1/N2;
                break;
                        
            default:
                System.out.println("Operador invalido");
        }
            return resultado;
        }
}