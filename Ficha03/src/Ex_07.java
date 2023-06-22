import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, vezesDigitadas=0, media;

        System.out.print("Digite um número ");
        num = input.nextInt();

        while (num != -1){
            System.out.print("Digite um número ");
            num = input.nextInt();

            num += num;
            vezesDigitadas = vezesDigitadas +1;


        }
        if (num == -1){
            media = (num/vezesDigitadas) -1;
            System.out.print(media);
        }

    }
}
