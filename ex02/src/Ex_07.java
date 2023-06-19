import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num;

        System.out.print("Digite um número ");
        num = input.nextDouble();

        if(num%2 != 0) {
            System.out.print("O número é ímpar");
        } else{
            System.out.print("O número é par");
        }

    }
}
