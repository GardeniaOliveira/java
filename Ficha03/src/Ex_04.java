import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Digite o primeiro número ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número ");
        num2 = input.nextInt();
        if (num1 <= num2){
            while(num1 <= num2){
                System.out.println(num1);
                num1++;
            }
        } else{
            while(num2 <= num1){
                System.out.println(num2);
                num2++;
            }
        }


    }
}
