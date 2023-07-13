package ficha06;

import java.util.Scanner;

public class Ex_13 {

    static void   desenharColuna( String caracter,int linha, int coluna){

        for(int i=0; i<coluna-1; i++){
            System.out.print(" " + caracter + " ");
        }



            //for(int j=0; j<1 && j==6; j++){
        /*for(int j=0; j>linha-1; j++){
                System.out.print( caracter);
                for(int l=2;l<coluna; l++){
                    System.out.print(" ");
                }
        }*/

        //primeira coluna
       for(int i=0; i<linha-1; i++){
           System.out.println(" " + caracter + " ");



       }


       //ultima linha
        for(int i=0; i<coluna; i++){
            System.out.print(" " + caracter + " ");
        }

       for (int i = 1; i <= linha; i++) {
            for (int x = 1; x <= coluna; x++) {
                if (i == 1 || i == linha || x == 1 || x == coluna) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
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
