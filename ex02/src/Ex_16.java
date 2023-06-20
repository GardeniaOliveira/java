import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, resto = 0, notaDuzentos = 0, notaCem = 0, notaCinquenta = 0, notaVinte = 0, notaDez = 0, notaCinco = 0;


        System.out.print("Digite um número: ");
        num = input.nextInt();

        if (num % 5 == 0) {

            if (num >= 200) {
                notaDuzentos = num / 200;
                resto = num % 200;
                System.out.println(notaDuzentos + "notas de 200");
                System.out.println("Restou: " + resto);
            }
            if (resto >= 100) {
                notaCem = resto / 100;
                resto = num % 100;
                System.out.println(notaCem + "notas de 100");
                System.out.println("Restou: " + resto);
            }

            if (resto >= 50) {
                notaCinquenta = resto / 50;
                resto = num % 50;
                System.out.println(notaCinquenta + "notas de 50");
                System.out.println("Restou: " + resto);
            }
            if (resto >= 20) {
                notaVinte = resto / 20;
                resto = num % 20;
                System.out.println(notaVinte + "notas de 20");
                System.out.println("Restou: " + resto);
            }
            if (resto >= 10) {
                notaDez = resto / 10;
                resto = num % 10;
                System.out.println(notaDez + "notas de 10");
                System.out.println("Restou: " + resto);
            }

            notaCinco = resto / 5;
            System.out.println(notaCinco + "notas de 5");
            System.out.println("Restou: " + resto);


            System.out.println("\nprecisamos de " + notaDuzentos + "notas de 200, " + notaCem + "notas de 100, " + notaCinquenta +
                    "notas de 50, " + notaVinte + "notas de 20, " + notaDez + "nota de 10"+notaCinco+" notas de 5");
        }
    }
}
