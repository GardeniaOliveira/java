import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInserido, numIncial = 2;

        System.out.print("Digite um número ");
        numInserido = input.nextInt();


       /* while (num2 <= num) {
            System.out.println(num);
            num = num - 2;
        }*/

        while (numIncial <= numInserido) {  //2 e 49
            System.out.println(numIncial);
            numIncial+=2;
        }

    }

    }

