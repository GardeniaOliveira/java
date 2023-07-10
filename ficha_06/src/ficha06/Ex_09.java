package ficha06;

import java.util.Scanner;

public class Ex_09 {
    static int preencherArray(int[] vetor){
        Scanner input= new Scanner(System.in);
        int menorElemento;


        vetor = new int[10];

        for(int i=0; i<10; i++){
            System.out.print("Introduza um número no vetor["+i+"] : ");
            vetor[i] = input.nextInt();
        }


        menorElemento= vetor[0];

        for(int i=0; i< vetor.length; i++){

            if ( vetor[i] < menorElemento) {
                menorElemento=vetor[i];

            }

        }
        return menorElemento;




    }

    public static void main(String[] args) {
        int[] vetor = new int[10];

        System.out.println(preencherArray(vetor));


    }
}
