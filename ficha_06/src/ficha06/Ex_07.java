package ficha06;

import java.util.Scanner;

public class Ex_07 {

    static int[] preencherArray(int[] vetor, int tamanho){
        Scanner input= new Scanner(System.in);

         vetor = new int[tamanho];

        for(int i=0; i<tamanho; i++){
            System.out.print("Introduza um número no vetor["+i+"] : ");
            vetor[i] = input.nextInt();
        }

        return vetor;
    }
    static void imprimirVetor(int[] vetor, int tamanho){
        System.out.print( "[ ");
        for(int i=0; i<4; i++){
            System.out.print( vetor[i] + ", ");
        }
        System.out.print( "] ");
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int tamanho;

        System.out.print("Introduza o tamanho do array : ");
        tamanho= input.nextInt();

        int[] vetor= new int [tamanho];

       vetor = preencherArray(vetor, tamanho);

       imprimirVetor(vetor, tamanho);



    }
    }

