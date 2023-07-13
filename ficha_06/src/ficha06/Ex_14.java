package ficha06;

import java.util.Scanner;

public class Ex_14 {
    static void somarMatrizes(int[ ][ ] matriz1, int[ ][ ] matriz2){
        int soma=0;

    for (int linhaMatriz=0; linhaMatriz<matriz1.length; linhaMatriz++){
    for (int colunaMatriz=0; colunaMatriz<matriz1[0].length; colunaMatriz++){

        soma= matriz1[linhaMatriz][colunaMatriz] + matriz2[linhaMatriz][colunaMatriz];
        System.out.print("\t"+soma);
    }
    System.out.println();
}

    }
    static int somatorioMatrizes(int[ ][ ] matriz1, int[ ][ ] matriz2) {
        int somatorio=0;

        for (int linhaMatriz = 0; linhaMatriz < matriz1.length; linhaMatriz++) {
            for (int colunaMatriz = 0; colunaMatriz < matriz1.length; colunaMatriz++) {
                somatorio +=  matriz1[linhaMatriz][colunaMatriz] + matriz2[linhaMatriz][colunaMatriz] ;
            }

        }
        System.out.print("este é o resultado do somatório: " +somatorio);
        return somatorio;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int somatorio;


        //criar matriz1
        for(int linha=0; linha<3; linha++){

            //o for da coluna executa 3x antes de voltar para o for da linha;
            for(int coluna=0; coluna<3; coluna++){
                System.out.print("Introduza um número na matriz1["+coluna+"] : ");
                matriz1[linha][coluna] = input.nextInt();
            }
        }
        //imprimir matriz1

        for( int linha=0; linha<3; linha++){

            for(int coluna=0; coluna<3; coluna++){
                System.out.print(" "+matriz1[linha][coluna]+" ");
            }
            System.out.println(" ");
        }

        //criar matriz2
        for(int linha=0; linha<3; linha++){

            //o for da coluna executa 3x antes de voltar para o for da linha;
            for(int coluna=0; coluna<3; coluna++){
                System.out.print("Introduza um número na matriz2["+coluna+"] : ");
                matriz2[linha][coluna] = input.nextInt();

            }

        }

        //imprimir matriz2

        for( int linha=0; linha<3; linha++){

            for(int coluna=0; coluna<3; coluna++){
                System.out.print(" "+matriz2[linha][coluna]+" ");
            }
            System.out.println(" ");
        }

        somarMatrizes(matriz1,matriz2);
        somatorio = somatorioMatrizes(matriz1, matriz2);
    }
}
