package Unidade5;
import java.util.Scanner;

public class Uni5Exe3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double soma = 0;

        for (double i = 1; i <= 100; i++) {
            soma += 1 / i; 
        }
        
        System.out.println(soma); 
   
        teclado.close();
    }
}
