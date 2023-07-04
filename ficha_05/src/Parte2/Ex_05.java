package Parte2;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        double[] vetor = new double[10];
        double sum=0, media=0;

        for(int i=0; i<10; i++){
            System.out.print("Introduza o no array["+i+"] : ");
            vetor[i] = input.nextInt();
            sum+=vetor[i];


        }
        media= sum/10;
        System.out.println(sum);
        System.out.println("A média é : "+ media);
    }
}
