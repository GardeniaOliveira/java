package Ex_11;

public class Conta {

    private String n_conta;

    private double saldo;

    private String titular;

    public Conta(String n_conta, double saldo, String titular) {
        this.n_conta = n_conta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getN_conta() {
        return n_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
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

    public void mostrarSaldo(){
        System.out.println("Saldo da conta " + this.n_conta + "  é de: " + this.saldo + " EUR");
    }
}
