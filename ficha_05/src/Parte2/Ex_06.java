package Parte2;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[] vetor = new int[10];
        int next=0, previous;
        boolean crescente=true;

        System.out.print("Introduza um número no vetor["+0+"] : ");
        vetor[0] = input.nextInt();

        previous = vetor[0];


        for(int i=1; i<10; i++){
            System.out.print("Introduza um número no vetor["+i+"] : ");
            vetor[i] = input.nextInt();
        }

        for(int i=1; i<10; i++){
            next=vetor[i];
            previous=next;

            if(  vetor[i] > previous  ){

                crescente=true;

                } else{
                crescente=false;


                }

        }

        if(crescente){
            System.out.println( "crescente");
        } else{
            System.out.println( "NÃO é crescente");
        }

    }
}
