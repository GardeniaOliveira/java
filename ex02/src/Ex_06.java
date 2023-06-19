import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;

        System.out.print("Digite o primeiro número ");
        num1 = input.nextDouble();

        System.out.print("Digite o segundo número ");
        num2 = input.nextDouble();

        if(num1 > num2){
            System.out.print("O maior número é: " + num1 + "e o menor número é: " + num2);
        } else if(num1 < num2){
            System.out.print("O maior número é: " + num2 + "e o menor número é: " + num1);
        } else{
            System.out.print("Os números são iguais ");
        }
    }
}

