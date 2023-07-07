package ficha06;

import java.util.Scanner;

public class Ex_06 {

    static boolean  evenOrOdd(int num){
        boolean isEven = true;
        if(num%2==0){
            System.out.println(isEven);
            return isEven;

        }else{
            isEven=false;
            System.out.println(isEven);
            return isEven;
        }
    }

    static boolean  positiveOrNegative(int num){
        boolean isPositive = false;
        if(num>=0){
            isPositive=true;

        }
        return isPositive;

    }

    static boolean  primo(int num) {
        boolean isPrimo = true;


        for (int divisor = 2; divisor < num; divisor++) {

            if (num % divisor == 0) {
                isPrimo = false;
            }


        }
        return isPrimo;



    }

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
    static void chooseFunction(int num) {
        Scanner input = new Scanner(System.in);

        int option;

        do{
        System.out.println("Digite um número para escolher uma função: 1-Par | 2-Positivo | 3-Primo | 4-Perfeito ");
        option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println(evenOrOdd(num));
                break;

            case 2:
                System.out.println( positiveOrNegative(num));
                break;

            case 3:
                System.out.println(primo(num));
                break;

            case 4:
                System.out.println(perfeito(num));
                break;

            default:
                System.out.println("Número indefinido");
        }
        }while(option<4);


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num;
        System.out.println("Digite um número para testar");
        num = input.nextInt();

      chooseFunction(num);

        System.out.println("\nFIM!");
    }
}
