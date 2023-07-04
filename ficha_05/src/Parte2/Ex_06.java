package Parte2;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[] vetor = new int[10];
        int next=0, previous=0;

        System.out.print("Introduza um número no vetor["+0+"] : ");
        vetor[0] = input.nextInt();

        next = vetor[0];

        for(int i=1; i<10; i++){
            System.out.print("Introduza um número no vetor["+i+"] : ");
            vetor[i] = input.nextInt();

            if(  vetor[i] < next  ){
                next=vetor[i];
                previous=next;
                
                System.out.println(  next + " " +previous );
            } else{
                System.out.println(  previous + " " +next);
            }

        }
    }
}
