import java.util.Scanner;
public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;
            String  operation, question="s";


while (question.equals("s")) {

        System.out.print("Digite o primeiro numero ");
        num1 = input.nextDouble();

        System.out.print("Digite o segundo numero ");
        num2 = input.nextDouble();

        System.out.print("Digite a operação matemática(+, -,  *,  /): ");
        operation = input.next();


            switch (operation) {
                case "+":
                    result = num1+num2;
                    System.out.println(result);
                    break;

                case "-":
                    result = num1-num2;
                    System.out.println(result);
                    break;

                case "*":
                    result = num1*num2;
                    System.out.println(result);
                    break;
                case "/":
                    result = num1/num2;
                    System.out.println(result);
                    break;
            }
    System.out.println("Deseja continuar? (introduza s/n)");
    question = input.next();
        }

    }

}
