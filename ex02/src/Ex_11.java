import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance, value, result;
        String operation;

        System.out.print("Digite o seu saldo: ");
        balance = input.nextDouble();

        System.out.print("Digite o valor a creditar/debitar: ");
        value = input.nextDouble();

        System.out.print("Deseja debitar(-)ou creditar (+) : ");
        operation = input.next();

        if(operation.equals("+")){
            result = balance + value;
        } else{
            result = balance - value;
        }

        if( result >= balance){
            System.out.print("O seu saldo é positivo :  " + result);
        } else{
            System.out.print("Operação inválida! o seu saldo é negativo :  " + result);
        }


    }
}
