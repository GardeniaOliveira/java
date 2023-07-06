package Parte2;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int matriz[][]= new int[3][3], repete=0, linha=0, coluna=0, menor=0, maior=0;


        //montar matriz
        for( linha=0; linha<3; linha++){

            //o for da coluna executa 3x antes de voltar para o for da linha;
            for( coluna=0; coluna<3; coluna++){
                System.out.print("Introduza um número no vetor["+coluna+"] : ");
                matriz[linha][coluna] = input.nextInt();
            }

        }

        //imprimir matriz
        for( linha=0; linha<3; linha++){

            for( coluna=0; coluna<3; coluna++){
                System.out.print(" "+matriz[linha][coluna]+" ");
            }
            System.out.println(" ");
        }

        //comparar numeros

        for( linha=0; linha<3; linha++) {

            for (coluna = 0; coluna < 3; coluna++) {


                for(int i=0; i<3; i++) {
                    if(menor ==0 || maior ==0) {
                        menor = matriz[0][0];
                        maior = matriz[0][0];
                    }

                    else if (matriz[linha][coluna] > menor) {

                       maior= matriz[linha][coluna];

                    }
                    else if(matriz[linha][coluna] < maior){
                        menor=matriz[linha][coluna];
                    }


                    }
                }



            }
        System.out.println("o maior numero é :  " +maior + " o menor número é: " +menor);
        }


    }

