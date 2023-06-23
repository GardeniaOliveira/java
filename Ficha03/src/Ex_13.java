import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int num, resultado=0;

    System.out.print("Digite um número: ");
    num = input.nextInt();

    while (num > 0){
        num = num*(num-1);
        resultado *= num;

        num--;
        System.out.print(resultado);

    }


    }
}
