package Parte2;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int matriz[][]= new int[5][5], sum=0;


        for(int linha=0; linha<5; linha++){

            //o for da coluna executa 3x antes de voltar para o for da linha;
            for(int coluna=0; coluna<5; coluna++){
                System.out.print("Introduza um número no vetor["+coluna+"] : ");
                matriz[linha][coluna] = input.nextInt();
                sum+= matriz[linha][coluna];
            }
            System.out.print("a soma da matriz é: " + sum);
        }

        for(int linha=0; linha<5; linha++){

            for(int coluna=0; coluna<5; coluna++){
                System.out.print(" "+matriz[linha][coluna]+" ");
            }
            System.out.println(" ");
        }


    }
}
