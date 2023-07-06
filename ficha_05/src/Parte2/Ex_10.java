package Parte2;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int matriz[][]= new int[4][5], repete=0, linha=0, coluna=0, comparar;


        for( linha=0; linha<4; linha++){

            //o for da coluna executa 3x antes de voltar para o for da linha;
            for( coluna=0; coluna<5; coluna++){
                System.out.print("Introduza um número no vetor["+coluna+"] : ");
                matriz[linha][coluna] = input.nextInt();
            }

        }

        for( linha=0; linha<4; linha++){

            for( coluna=0; coluna<5; coluna++){
                System.out.print(" "+matriz[linha][coluna]+" ");
            }
            System.out.println(" ");
        }

        System.out.print("Introduza um número : ");
      comparar = input.nextInt();

        for( linha=0; linha<4; linha++){

            //o for da coluna executa 3x antes de voltar para o for da linha;
            for( coluna=0; coluna<5; coluna++){
                if( comparar ==matriz[linha][coluna]){
                    repete++;
                    System.out.println("o numero:  " + comparar +" se repete " + repete +" vezes ");
                }


            }
        }


    }
}
