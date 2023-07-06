package Parte2;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[] vetor = new int[10];
        int maior=0;
        boolean par=false;


        System.out.print("Introduza um número no vetor["+0+"] : ");
        vetor[0] = input.nextInt();

        maior = 0;

        for(int i=1; i<10; i++){
            System.out.print("Introduza um número no vetor["+i+"] : ");
            vetor[i] = input.nextInt();


                if (vetor[i] > maior && vetor[i]%2==0) {

                    maior = vetor[i];
                    par = true;
                }

        }

        if(par){
            System.out.print("o maior valor é : " + maior);
        } else{
            System.out.print("não existe um valor de número par");
        }



    }
}
