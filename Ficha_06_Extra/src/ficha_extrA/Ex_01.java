package ficha_extrA;

import java.util.Scanner;

public class Ex_01 {

    static void menorNumero(int num1, int num2, int num3){
        int result;
        if(num1 < num2 && num1< num3){
            result=num1;
        } else if(num2 < num1 && num2< num3){
            result=num2;
        }else{
            result=num3;
        }

        System.out.print("Este é o menor número: " + result);
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Digite o primeiro número: ");
        num1=input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2=input.nextInt();

        System.out.print("Digite o terceiro número: ");
        num3=input.nextInt();

        menorNumero(num1, num2,num3);
    }


}
