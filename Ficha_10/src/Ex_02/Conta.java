package Ex_02;

public class Conta {
    private String n_conta;
    private String titular;
    private double saldo;
    private double m_emprestimo;
    private double divida;
    private int ano_abertura =2023;

    public Conta(String n_conta, String titular) {
        this.n_conta = n_conta;
        this.titular = titular;
    }



    public void transferencia(double valor_transferir, Conta conta_destinatario){
        if(this.saldo >= valor_transferir) {
            this.saldo = saldo - valor_transferir;
            System.out.println(this.titular + ", seu saldo após a transferência é de: " + this.saldo);

            conta_destinatario.receber(valor_transferir);
        } else{
            System.out.println(this.titular + ", você não tem saldo suficiente  ");
        }
    }

    public void receber(double valor_transferir) {
        this.saldo = saldo + valor_transferir;
        System.out.println(this.titular+", seu saldo após o recebimento da transferência é de: " + this.saldo);
    }

    public void depositar(double valor_depositar){
        this.saldo = saldo + valor_depositar;
        System.out.println("Saldo da conta " + this.n_conta + " após o deposito  é de: " + this.saldo + " EUR");

    }

    public void levantar(double valor_levantar){
        if(this.saldo >= valor_levantar) {
            this.saldo = saldo - valor_levantar;
            System.out.println("Saldo da conta " + this.n_conta + " após o saque  é de: " + this.saldo + " EUR");
        } else {
            System.out.println("Saldo da conta " + this.n_conta + " não é suficiente para esta operação");
        }
    }

    public double margem_emprestimo(){
        return this.m_emprestimo = this.saldo*0.90;
    }

    public void pedirEmprestimo(double valor_emprestimo ){

        if(valor_emprestimo <= this.margem_emprestimo()) {
            this.saldo = saldo + valor_emprestimo;
            this.divida = valor_emprestimo;
            System.out.println("Saldo da conta  após o emprestimo  é de: " + this.saldo + " EUR");
        } else {
            if(this.divida>0){
                System.out.println("você já tem uma dívida. Não pode efetuar um emprestimo");
            }else {
                System.out.println("Saldo da conta  não é suficiente para esta operação");
            }
        }
    }
    public void mostrarSaldo(){
        System.out.println("Saldo da conta " + this.n_conta + "  é de: " + this.saldo + " EUR");
    }

}
