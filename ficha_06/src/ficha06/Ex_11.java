package ficha06;

import java.util.Scanner;

public class Ex_11 {

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
        for(int i=0; i<vetor.length; i++){
            System.out.print( vetor[i] + ", ");
        }
        System.out.print( "] ");
    }

    static int maiorElemento(int[] vetor, int tamanho){

        Scanner input= new Scanner(System.in);
        int maiorElemento=0;


        //vetor = new int[tamanho];

        maiorElemento= vetor[0];

        for(int i=0; i< vetor.length; i++){

            if ( vetor[i] > maiorElemento) {
                maiorElemento=vetor[i];

            }

        }
        return  maiorElemento;




    }

    static int menorElemento(int[] vetor, int tamanho){
        Scanner input= new Scanner(System.in);
        int menorElemento;




        menorElemento= vetor[0];

        for(int i=0; i< vetor.length; i++){

            if ( vetor[i] < menorElemento) {
                menorElemento=vetor[i];

            }

        }
        return menorElemento;




    }

    static boolean crescente(int[] vetor, int tamanho){
        Scanner input= new Scanner(System.in);
        boolean cresente=true;

        for(int i=1; i< vetor.length; i++){

            if ( vetor[i] <  vetor[i-1]) {
                cresente=false;

            }

        }
        return cresente;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int tamanho, option, continuar;

        System.out.print("Introduza o tamanho do array : ");
        tamanho= input.nextInt();

        int[] vetor= new int [tamanho];

        vetor = preencherArray(vetor, tamanho);

        imprimirVetor(vetor, tamanho);

do{

        do{
            System.out.println("Escolha uma opçÃO : 1-maiorElemento 2-menorElemento 3-crescente ");
            option= input.nextInt();
        switch (option){
            case 1:
                System.out.println( "O maior valor encontrado é: " + maiorElemento(vetor, tamanho));
                break;
            case 2:
                System.out.println( "O menor valor encontrado é: " + menorElemento(vetor, tamanho));
                break;

            case 3:
                System.out.println( "crescente é igual a: " + crescente(vetor, tamanho));
                break;
            default:
                System.out.println( "Está opção não está no menu" );
            break;

        }
        } while (option<1 ||option >3);

        System.out.println("Deseja continuar: 1-SIM 2-Não");
   continuar= input.nextInt();

} while(continuar == 1);

    }

}
