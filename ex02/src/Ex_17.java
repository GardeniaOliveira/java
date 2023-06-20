import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldoMedio, valorDeCredito;

        System.out.print("Digite o seu saldo médio do último ano: ");
        saldoMedio = input.nextInt();

        if(saldoMedio >= 0 && saldoMedio <= 2000){
            System.out.print("Nenhum crédito ");
        } else if (saldoMedio >= 2000 && saldoMedio <= 4000){
            valorDeCredito = saldoMedio * 0.2;
            System.out.print("o valor de crédito é " + valorDeCredito);
        }else if (saldoMedio >= 4000 && saldoMedio <= 6000){
            valorDeCredito = saldoMedio * 0.3;
            System.out.print("o valor de crédito é " + valorDeCredito);
        }else {
            valorDeCredito = saldoMedio * 0.4;
            System.out.print("o valor de crédito é " + valorDeCredito);
        }
    }
}
