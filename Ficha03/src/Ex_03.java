import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Digite um número ");
        num = input.nextInt();

        while(num >=0){
            System.out.println(num);
            num --;
        }
    }
}
