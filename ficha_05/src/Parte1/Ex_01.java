package Parte1;

import java.util.Scanner;
public class Ex_01 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int[] vetor = new int[10];

        for(int i=0; i<10; i++){
            System.out.print("Introduza um número no vetor["+i+"] : ");
            vetor[i] = input.nextInt();
        }

        for(int i=0; i<10; i++){
            System.out.println("Array["+i+"]: "+vetor[i]);
        }

    }
}
