import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary;

        System.out.print("Digite o seu salário anual: ");
        salary = input.nextDouble();

        if(salary <= 15000){
            salary= salary *0.2;
            System.out.print("Você pagará " + salary + " de impostos");
        }else if(salary > 15000 && salary <= 20000){
            salary= salary *0.3;
            System.out.print("Você pagará " + salary + " de impostos");
        }else if(salary > 20000 && salary >= 25000){
            salary= salary *0.35;
            System.out.print("Você pagará " + salary + " de impostos");
        }else{
            salary= salary *0.4;
            System.out.print("Você pagará " + salary + " de impostos");
        }
    }
}
