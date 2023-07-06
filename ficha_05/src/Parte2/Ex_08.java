package Parte2;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int matriz[][]= new int[3][3];


        for(int linha=0; linha<3; linha++){

            //o for da coluna executa 3x antes de voltar para o for da linha;
            for(int coluna=0; coluna<3; coluna++){
                System.out.print("Introduza um número no vetor["+coluna+"] : ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        for(int linha=0; linha<3; linha++){

            for(int coluna=0; coluna<3; coluna++){
                System.out.print(" "+matriz[linha][coluna]+" ");
            }
            System.out.println(" ");
        }


    }
}

/*
1 2 3 [0][0] [0][1] [0][2]
1 2 3 [1][0] [1][1] [1][2]
1 2 3 [2][0] [2][1] [2][2]
[linha][coluna]


 */
