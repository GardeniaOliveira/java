package ficha_extrA;

import java.util.Scanner;

public class Ex_04 {

    static void imprimirTabuada(int num){
        int result;
        for(int i=1; i<=10; i++){
            result= i*num;
            System.out.println( i + " * " + num + "  = " +result);
        }


    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

       int num;
        System.out.print("Introduza um numero: ");
        num = input.nextInt();

        imprimirTabuada(num);
    }
}
