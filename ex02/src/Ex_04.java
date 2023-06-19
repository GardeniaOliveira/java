import java.util.Scanner;
public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int position;

        System.out.print("Digite a sua posição: ");
        position = input.nextInt();

        switch (position) {
            case 1:
                System.out.print("Você ganhou 10 pontos ");
                break;

            case 2:
                System.out.print("Você ganhou 8 pontos ");
                break;

            case 3:
                System.out.print("Você ganhou 6 pontos ");
                break;

            case 4:
                System.out.print("Você ganhou 5 pontos ");
                break;

            case 5:
                System.out.print("Você ganhou 4 pontos ");
                break;

            case 6:
                System.out.print("Você ganhou 3 pontos ");
                break;
            case 7:
                System.out.print("Você ganhou 2 pontos ");
                break;
            case 8:
                System.out.print("Você ganhou 1 pontos ");
                break;
            default:
                System.out.print("Digite outra posição");
                break;
        }
    }
}
