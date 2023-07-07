package ficha06;

import java.util.Scanner;

public class Ex_04 {
    static boolean  primo(int num) {
        boolean isPrimo = true;


        for (int divisor = 2; divisor < num; divisor++) {

            if (num % divisor == 0) {
                isPrimo = false;
            }


        }
        return isPrimo;



    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num;
        System.out.println("Digite um número");
        num = input.nextInt();

        System.out.println(primo(num));

        System.out.println("\nFIM!");
    }
}
