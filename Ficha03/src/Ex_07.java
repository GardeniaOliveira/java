import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=0,  vezesDigitadas=0;
        double  media=0;

        while (num != -1){
            System.out.print("Digite um número ");
            num = input.nextInt();

            if(num!=-1){
                media += num;
                vezesDigitadas ++;
            }
        }
        media = media/vezesDigitadas  ;
        System.out.print("a média é: " +media);


    }
}
