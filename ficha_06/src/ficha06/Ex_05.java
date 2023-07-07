package ficha06;

import java.util.Scanner;

public class Ex_05 {
    static boolean perfeito(int num) {
        boolean isPerfeito = false;
        int sumDivisor=0;

        for (int divisor = 1; divisor < num; divisor++) {


           if(num % divisor == 0) {
               System.out.println(divisor);
               sumDivisor += divisor;

               if (sumDivisor == num) {
                   isPerfeito = true;
               }

           }
        }
        return isPerfeito;



    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num;
        System.out.println("Digite um número");
        num = input.nextInt();

        System.out.println(perfeito(num));

        System.out.println("\nFIM!");
    }
}



