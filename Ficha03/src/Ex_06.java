import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, numMaisCinco, numMenosCinco;

        System.out.print("Digite um número ");
        num = input.nextInt();

        numMaisCinco =  num+5;
        numMenosCinco= num-5;


        while (num > numMenosCinco ){
            System.out.println(numMenosCinco);
            numMenosCinco= numMenosCinco + 1;


        }

        while (num < numMaisCinco ){

            num= num + 1;
            System.out.println(num);


        }

    }
}
