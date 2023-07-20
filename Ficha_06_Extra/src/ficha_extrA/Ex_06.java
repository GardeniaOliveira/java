package ficha_extrA;

import java.util.Scanner;

public class Ex_06 {
    static  int somatorio(int num){
        int num1, num2, num3, divisao, soma;

        num1 = num/100;
        System.out.println(num1);
divisao=num1;

        System.out.println(num1);

        num2= divisao%10;
        System.out.println(num2);

        num3= num%10;
        System.out.println(num3);

        soma= num1 + num2+ num3;

        return soma;

    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int num;
        System.out.print("Introduza um numero: ");
        num = input.nextInt();

        somatorio(num);

}
}
