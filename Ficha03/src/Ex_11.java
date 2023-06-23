import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInicial, numFinal;

        System.out.print("Digite o primeiro número ");
        numInicial = input.nextInt();

        System.out.print("Digite o segundo número  ");
        numFinal= input.nextInt();
       /* if(numInicial> numFinal){
            numFinal = numInicial;
            numInicial =  numInicial - numFinal;
        }*/

        while (numInicial <= numFinal   ) {

            if(numInicial%5 == 0)
            System.out.println(numInicial);
            numInicial++;
        }
    }
}
