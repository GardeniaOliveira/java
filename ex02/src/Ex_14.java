import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, num3;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        System.out.print("Digite o terceiro número: ");
        num3 = input.nextDouble();

        if(num1 <= num2 && num1 <= num3 ){
            if (num2 <= num3){
                System.out.print(num1 + "," + num2 + "," + num3 );
            } else{
                System.out.print(num1 + "," + num3 + "," + num2 );
            }

        } else if(num2 <= num1 && num2 <= num3){
            if (num1 <= num3){
                System.out.print(num2 + "," + num1 + "," + num3 );
            }else{
                System.out.print(num2 + "," + num3 + "," + num1 );
            }

        } else if(num3 <= num1 && num3 <= num2){
            if (num2 <= num1){
                System.out.print(num3 + "," + num2 + "," + num1 );
            }else{
                System.out.print(num3 + "," + num1 + "," + num2 );
            }
        }

    }
}
