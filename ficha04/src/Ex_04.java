import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, divisor, primo;

        System.out.println("Digite um número ");
        num = input.nextInt();


        divisor = num;
        while(divisor > 1){

            primo = num/divisor;

            System.out.println( primo);

            divisor--;




            /*if (divisor != num && divisor != 1){
                System.out.println( num + " não é um número primo ");
            } else {
                System.out.println(num + " é um número primo ");
            }*/
        }



    }
}
