import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int num, fatorial;

    System.out.print("Digite um número: ");
    num = input.nextInt();

    fatorial= num;

    while (num > 1){
        num--;
        fatorial =num*fatorial;
    }
        System.out.print(fatorial);

    }
}
