import java.util.Scanner;
public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double vencimento, subsidio, retencao, segurancaSocial, valorLiquido, encargoFuncionario, encargoPatronal;
        String cargo= "A", question = "c";
        int diasTrabalhados, codigoFuncionario;

        while (question.equals("c")) {

            System.out.print("Digite o código de funcionario (ou digite 0 para sair): ");
            codigoFuncionario = input.nextInt();

            if(codigoFuncionario !=0) {

                do {
                    System.out.print("Digite o cargo E-Empregado; C-Chefe; A-Administrador; S-Sair :  ");
                    cargo = input.next();

                } while (!cargo.equals("E") && !cargo.equals("C") && !cargo.equals("A") & !cargo.equals("S"));


           if(!cargo.equals("S")) {


                System.out.print("Digite os dias trabalhados (ou digite 0 para sair): ");
                diasTrabalhados = input.nextInt();


           if (diasTrabalhados !=0){


                if (cargo.equals("E")) {
                    vencimento = 40 * diasTrabalhados;
                    subsidio = 5 * diasTrabalhados;
                    if (vencimento <= 1000) {
                        retencao = vencimento * 0.1;
                    } else {
                        retencao = (vencimento * 0.2);
                    }
                    encargoFuncionario = vencimento * 0.11;
                    encargoPatronal = vencimento * 0.2375;
                    segurancaSocial = encargoFuncionario + encargoPatronal;

                    valorLiquido = (vencimento + subsidio) - retencao;

                    System.out.print("o valor iliquido para Empregado é " + vencimento + ", o subsidio alimentação é " + subsidio +
                            "o valor de retenção do irs é: " + retencao + " valor a entregar a segurança social é: " + segurancaSocial
                            + "e o valor liquido a receber é: " + valorLiquido);

                } else if (cargo.equals("C")) {
                    vencimento = 60 * diasTrabalhados;
                    subsidio = 7.5 * diasTrabalhados;
                    if (vencimento <= 1000) {
                        retencao = (vencimento * 0.1);
                    } else {
                        retencao = (vencimento * 0.2);
                    }
                    encargoFuncionario = vencimento * 0.11;
                    encargoPatronal = vencimento * 0.2375;
                    segurancaSocial = encargoFuncionario + encargoPatronal;
                    valorLiquido = (vencimento + subsidio) - retencao;

                    System.out.print("o valor iliquido para Chefe é " + vencimento + ", o subsidio alimentação é " + subsidio +
                            "o valor de retenção do irs é: " + retencao + " valor a entregar a segurança social é: " + segurancaSocial
                            + "e o valor liquido a receber é: " + valorLiquido);
                } else {
                    vencimento = 80 * diasTrabalhados;
                    subsidio = 7.5 * diasTrabalhados;
                    if (vencimento <= 1000) {
                        retencao = (vencimento * 0.1);
                    } else {
                        retencao = (vencimento * 0.2);
                    }
                    encargoFuncionario = vencimento * 0.9;
                    encargoPatronal = vencimento * 0.21;
                    segurancaSocial = encargoFuncionario + encargoPatronal;

                    valorLiquido = (vencimento + subsidio) - retencao;

                    System.out.println("o valor iliquido para Administradores é " + vencimento + ", o subsidio alimentação é " + subsidio +
                            "o valor de retenção do irs é: " + retencao + " valor a entregar a segurança social é: " + segurancaSocial
                            + "e o valor liquido a receber é: " + valorLiquido);

                }

            }else{

               do {
                   System.out.println("Deseja realizar outro calculo? (introduza c para continuar ou s para sair) ");
                   question = input.next();
               } while (!question.equals("c") && !question.equals("s"));
           }

           } else{

               do {
                   System.out.println("Deseja realizar outro calculo? (introduza c para continuar ou s para sair) ");
                   question = input.next();
               } while (!question.equals("c") && !question.equals("s"));


           }
            }
           else{

                do {
                    System.out.println("Deseja realizar outro calculo? (introduza c para continuar ou s para sair) ");
                    question = input.next();
                } while (!question.equals("c") && !question.equals("s"));
            }


        }//chave do while CONTINUAR

    }//chave da funcao
}
