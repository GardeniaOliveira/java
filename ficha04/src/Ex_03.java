import java.util.Scanner;
public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPlayer1, numPlayer2;

        System.out.println("Digite um número entre 0 e 100 ");
        numPlayer1 = input.nextInt();

        System.out.println("qual o número do jogador 1?");
        numPlayer2 = input.nextInt();

        if (numPlayer1 >= 0 && numPlayer1 <= 100) {
            do {

                if (numPlayer2 > numPlayer1){
                    System.out.println("o número é maior");
                } else{
                    System.out.println("o número é menor");
                }
                System.out.println("qual o número do jogador 1?");
                numPlayer2 = input.nextInt();
            } while (numPlayer2 != numPlayer1);

                System.out.println("Você acertou!");

        }
    }
}
