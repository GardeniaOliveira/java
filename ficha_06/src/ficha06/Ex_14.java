package ficha06;

import java.util.Scanner;

public class Ex_14 {
    static void somarMatrizes(int[ ][ ] matriz1, int[ ][ ] matriz2){




    }
    static int somatorioMatrizes(int[ ][ ] matriz1, int[ ][ ] matriz2){
        int somatorio=0;

        for(int i=0; i<matriz1.length; i++){
            for (int j=0; j<matriz1.length; j++)
        somatorio += matriz1[i][i];
        }
        System.out.println(somatorio);


        for(int i=0; i<matriz2.length; i++){
            for (int j=0; j<matriz2.length; j++)
                somatorio += matriz2[i][i];
        }
        System.out.println(somatorio);
        return somatorio;


    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int somatorio;

// Inicializar matriz
        somarMatrizes(matriz1, matriz2);
       somatorio = somatorioMatrizes(matriz1, matriz2);
       

        for(int linha=0; linha<3; linha++){

            //o for da coluna executa 3x antes de voltar para o for da linha;
            for(int coluna=0; coluna<3; coluna++){
                System.out.print("Introduza um número na matriz1["+coluna+"] : ");
                matriz1[linha][coluna] = input.nextInt();
            }
        }

        for(int linha=0; linha<3; linha++){

            //o for da coluna executa 3x antes de voltar para o for da linha;
            for(int coluna=0; coluna<3; coluna++){
                System.out.print("Introduza um número na matriz2["+coluna+"] : ");
                matriz2[linha][coluna] = input.nextInt();

            }

        }
    }
}
