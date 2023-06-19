import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, result;
        String  operation;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        System.out.print("Digite a operação matemática: ");
        operation = input.next();

        if(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/") ) {

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    System.out.print(result);
                    break;

                case "-":
                    result = num1 - num2;
                    System.out.print(result);
                    break;

                case "*":
                    result = num1 * num2;
                    System.out.print(result);
                    break;

                case "/":
                    result = num1 / num2;
                    System.out.print(result);
                    break;
            }
        } else{
            System.out.print("Digite um operador válido! ");
        }

    }
}
