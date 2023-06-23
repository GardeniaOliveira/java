import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num=0, intervalo1=0, intervalo2=0, intervalo3=0, intervalo4=0;

        while (num != -1){
            System.out.print("Digite um número ");
            num = input.nextInt();

            if(num>=0 && num<=25 ){
                intervalo1++;

            }
            else if(num>=26 && num<=50 ){
                intervalo2++;

            }
            else if(num>=51 && num<=75 ){

                intervalo3++;
            } else if(num>=76 && num<=100 ) {

                intervalo4++;
            } else {
                System.out.println("saida");
            }
        }
        System.out.println( "você digitou " + intervalo1 + " números no intervalo está entre 0 e 25 " +
                intervalo2 + " números no intervalo está entre 26 e 50 "
                + intervalo3 + " números no intervalo está entre 51 e 75 "
                + intervalo4 + " números no intervalo está entre 76 e 100 "
        );






    }
}
