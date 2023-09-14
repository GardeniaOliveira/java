package Ex_02;

public class main {
    public static void main(String[] args) {
 Conta conta1 = new Conta("pt0001",  "Augusta");

 conta1.mostrarSaldo();
 conta1.depositar(1000);
 conta1.margem_emprestimo();
 conta1.pedirEmprestimo(2000);
        conta1.pedirEmprestimo(500);
        conta1.pedirEmprestimo(2500);
    }
}
