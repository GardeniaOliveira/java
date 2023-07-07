package ficha06;

import java.util.Scanner;

public class Ex_03 {
    static boolean  positiveOrNegative(int num){
        boolean isPositive = false;
        if(num>=0){
            isPositive=true;

        }
            return isPositive;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num;
        System.out.println("Digite um número");
        num = input.nextInt();

        System.out.println(positiveOrNegative(num));

        System.out.println("\nFIM!");
    }
}
