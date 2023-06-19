import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2, n3, mediaPonderada;

        System.out.print("Digite a primeira nota ");
        n1 = input.nextDouble();

        System.out.print("Digite a segunda nota ");
        n2 = input.nextDouble();

        System.out.print("Digite a terceira nota ");
        n3 = input.nextDouble();

        if((n1>=0 && n1<=20) && (n2>=0 && n2<=20) && (n3>=0 && n3<=20)){
            mediaPonderada = (n1 * 0.25) + (n2 * 0.35) + (n3 * 0.4);
            if(mediaPonderada > 9.5){
                System.out.print("sua média foi " + mediaPonderada + " Parabéns, você foi aprovado! ");
            } else{
                System.out.print( "sua média foi " + mediaPonderada + " Infelizmente, você foi reprovado! ");
            }
        } else{
            System.out.print("Digite uma nota entre 0 e 20 ");
        }
    }
}
