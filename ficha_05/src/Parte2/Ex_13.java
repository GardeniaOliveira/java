package Parte2;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int matriz[][]= new int[4][4], sumDiagonal=0;


        for(int linha=0; linha<4; linha++){

            //o for da coluna executa 3x antes de voltar para o for da linha;
            for(int coluna=0; coluna<4; coluna++){
                System.out.print("Introduza um número no vetor["+coluna+"] : ");
                matriz[linha][coluna] = input.nextInt();

            }


        }

        for(int diagonal=0; diagonal <=3; diagonal++){
            sumDiagonal+= matriz[diagonal][diagonal];
        }
        System.out.println("a soma da matriz é: " + sumDiagonal);

        for(int linha=0; linha<4; linha++){

            for(int coluna=0; coluna<4; coluna++){
                System.out.print(" "+matriz[linha][coluna]+" ");
            }
            System.out.println(" ");
        }


    }
}
