import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anterior =0, proximo=0, numeros=0, contador=1;
        boolean crescente=true;

        System.out.print("Quantos numeros quer introduzir (minimo 2): ");
        numeros = input.nextInt();

        System.out.print("Digite um número ");
        anterior = input.nextInt();

        while (contador <  numeros){
            System.out.print("Digite um número ");
            proximo = input.nextInt();

            if (anterior < proximo){

            }else{
                crescente=false;
            }

            anterior = proximo;
            contador=contador+1;
        }

        if(crescente){
            System.out.println("Crescente");
        }else{
            System.out.println("Nao esta crescente");
        }
    }
}
