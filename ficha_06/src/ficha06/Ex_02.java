package ficha06;

import java.util.Scanner;

public class Ex_02 {

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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


       int num;
        System.out.println("Digite um número");
        num = input.nextInt();

       evenOrOdd(num);

        System.out.println("\nFIM!");
    }
}
