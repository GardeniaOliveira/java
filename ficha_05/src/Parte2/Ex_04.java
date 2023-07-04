package Parte2;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[] vetor = new int[10];
        int menorNumero=0;

        System.out.print("Introduza um número no vetor["+0+"] : ");
        vetor[0] = input.nextInt();

        menorNumero = vetor[0];

        for(int i=1; i<10; i++){
            System.out.print("Introduza um número no vetor["+i+"] : ");
            vetor[i] = input.nextInt();

            if(  vetor[i] < menorNumero  ){
                menorNumero=vetor[i];

                System.out.println("o menor valor é : " + menorNumero);
            } else{
                System.out.println("o menor valor é : " + menorNumero);
            }

        }



    }
}
