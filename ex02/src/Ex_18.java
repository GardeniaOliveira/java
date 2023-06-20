import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double vencimento, subsidio, retencao, segurancaSocial, valorLiquido, encargoFuncionario, encargoPatronal;
        String cargo;
        int diasTrabalhados, codigoFuncionario;


        System.out.print("Digite o código de funcionario: ");
        codigoFuncionario = input.nextInt();

        System.out.print("Digite o cargo E-Empregado; C-Chefe; A-Administrador:  ");
        cargo = input.next();

        System.out.print("Digite os dias trabalhados: ");
       diasTrabalhados = input.nextInt();

       if(cargo.equals("E")){
           vencimento = 40* diasTrabalhados;
           subsidio = 5*diasTrabalhados;
           if(vencimento <= 1000){
               retencao = vencimento * 0.1 ;
           } else{
               retencao = (vencimento * 0.2) ;
           }
           encargoFuncionario = vencimento * 0.11;
           encargoPatronal = vencimento * 0.2375;
           segurancaSocial = encargoFuncionario + encargoPatronal;

           valorLiquido = (vencimento + subsidio) - retencao ;

           System.out.print("o valor iliquido para Empregado é " +vencimento+ ", o subsidio alimentação é " + subsidio +
                   "o valor de retenção do irs é: " + retencao + " valor a entregar a segurança social é: " + segurancaSocial
           + "e o valor liquido a receber é: " + valorLiquido);

       } else if (cargo.equals("C")){
           vencimento = 60* diasTrabalhados;
           subsidio = 7.5*diasTrabalhados;
           if(vencimento <= 1000){
               retencao = (vencimento * 0.1) ;
           } else{
               retencao = (vencimento * 0.2) ;
           }
           encargoFuncionario = vencimento * 0.11;
           encargoPatronal = vencimento * 0.2375;
           segurancaSocial = encargoFuncionario + encargoPatronal;
           valorLiquido = (vencimento + subsidio) - retencao ;

           System.out.print("o valor iliquido para Chefe é " +vencimento+ ", o subsidio alimentação é " + subsidio +
                   "o valor de retenção do irs é: " + retencao + " valor a entregar a segurança social é: " + segurancaSocial
                   + "e o valor liquido a receber é: " + valorLiquido);
       } else{
           vencimento = 80* diasTrabalhados;
           subsidio = 7.5*diasTrabalhados;
           if(vencimento <= 1000){
               retencao = (vencimento * 0.1) ;
           } else{
               retencao = (vencimento * 0.2) ;
           }
           encargoFuncionario = vencimento * 0.9;
           encargoPatronal = vencimento * 0.21;
           segurancaSocial = encargoFuncionario + encargoPatronal;

           valorLiquido = (vencimento + subsidio) - retencao;

           System.out.print("o valor iliquido para Administradores é " +vencimento+ ", o subsidio alimentação é " + subsidio +
                   "o valor de retenção do irs é: " + retencao + " valor a entregar a segurança social é: " + segurancaSocial
                   + "e o valor liquido a receber é: " + valorLiquido);
       }

    }
}
