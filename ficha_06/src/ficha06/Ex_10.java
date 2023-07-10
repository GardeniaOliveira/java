package ficha06;

import java.util.Scanner;

public class Ex_10 {
    static boolean preencherArray(int[] vetor){
        Scanner input= new Scanner(System.in);
        boolean cresente=true;


        vetor = new int[10];

        for(int i=0; i<10; i++){
            System.out.print("Introduza um número no vetor["+i+"] : ");
            vetor[i] = input.nextInt();
        }



        for(int i=1; i< vetor.length; i++){

            if ( vetor[i] <  vetor[i-1]) {
               cresente=false;

            }

        }
        return cresente;




    }

    public static void main(String[] args) {
        int[] vetor = new int[10];

        System.out.println(preencherArray(vetor));


    }
}
