package ficha06;

import java.util.Scanner;

public class Ex_13 {

    static void   desenharColuna( String caracter,int linha, int coluna){

        for(int i=0; i<linha; i++){

            for(int j=0; j<coluna; j++){
                System.out.print(" " + caracter + " ");
            }
            System.out.println(" ");

            for(int l=0; l<linha+2; l++){
                System.out.print(" ");
            }

        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int linha, coluna;
        String caracter;

        System.out.print("Introduza o caracter : ");
        caracter= input.next();

        System.out.print("Introduza a quantidade de linhas : ");
        linha= input.nextInt();

        System.out.print("Introduza a quantidade de colunas : ");
        coluna= input.nextInt();

        desenharColuna(caracter, linha, coluna);

    }
}
