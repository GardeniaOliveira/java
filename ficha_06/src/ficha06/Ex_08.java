package ficha06;

import java.util.Scanner;

public class Ex_08 {

    static int preencherArray(int[] vetor){
        Scanner input= new Scanner(System.in);
        int maiorElemento=0;


        vetor = new int[10];

        for(int i=0; i<10; i++){
            System.out.print("Introduza um número no vetor["+i+"] : ");
            vetor[i] = input.nextInt();
        }


        maiorElemento= vetor[0];

        for(int i=0; i< vetor.length; i++){

            if ( vetor[i] > maiorElemento) {
                maiorElemento=vetor[i];

            }

        }
        return maiorElemento;




    }

    public static void main(String[] args) {
        int[ ] vetor = new int[10];

        System.out.println( preencherArray(vetor));

    }


}
