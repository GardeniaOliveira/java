package ficha06;

import java.util.Scanner;


public class Ex_12 {

    static int numAsterisco( int num){

        for(int i=0; i<num; i++)
             System.out.print("*");
        return num;

    }

    public static void main(String[] args) {
        int num;
        try (Scanner input = new Scanner(System.in)) {
            num = 0;

            do {
                System.out.print("Digite um número -do : ");
                num = input.nextInt();
            } while (num < 0);
        }


      numAsterisco(num);


    }

}
