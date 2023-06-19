import java.util.Scanner;
public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary;

        System.out.print("Digite o seu salário anual: ");
        salary = input.nextDouble();

        if(salary <= 15000){
        salary= salary *0.2;
            System.out.print("Você pagará " + salary + " de impostos");
        }else{
            salary= salary *0.3;
            System.out.print("Você pagará " + salary + " de impostos");
        }
    }
    }

