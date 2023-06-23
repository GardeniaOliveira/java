import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numLimite, numSalto, numZero =0;

        System.out.print("Digite um número limite ");
        numLimite = input.nextInt();

        System.out.print("Digite um número salto ");
        numSalto = input.nextInt();



        /*while (numLimite >= 0) {
            System.out.println(numLimite);
            numLimite-= numSalto;
        }*/

        while (numZero <= numLimite) {
            System.out.println(numZero);
            numZero+= numSalto;
        }
    }
}
