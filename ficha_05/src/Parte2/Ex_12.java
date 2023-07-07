package Parte2;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int matriz[][]= new int[10][2];
        int[] array1= new int[10];
        int[] array2= new int[10];


        for(int i=0; i<10; i++){
            System.out.print("Introduza um número no array1["+i+"] : ");
            array1[i] = input.nextInt();
        }

        for(int i=0; i<10; i++){
            System.out.print("Introduza um número no array2["+i+"] : ");
            array2[i] = input.nextInt();
        }

        for(int i=0; i<10; i++){
            System.out.print("|"+array1[i]+"\t");

        }

        System.out.println();

        for(int i=0; i<10; i++){
            System.out.print("|"+array2[i]+"\t");

        }
        System.out.println();

        //montar matriz
        for( int linha=0; linha<10; linha++){
            matriz[linha][0]= array1[linha];

            matriz[linha][1]= array2[linha];
        }



        //imprimir matriz
        for( int linha=0; linha<10; linha++){

            for(int coluna=0; coluna<2; coluna++){
                System.out.print(" "+matriz[linha][coluna]+" ");
            }
            System.out.println(" ");
        }
    }
}
