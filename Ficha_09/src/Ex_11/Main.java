package Ex_11;

public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta("pt0001", 0, "Augusta");
        Conta conta2 = new Conta("pt0002", 0, "Breno");
        Conta conta3 = new Conta("pt0003", 0, "Carla");

        conta1.mostrarSaldo();
        conta1.depositar(1000);
        conta1.levantar(120);

        conta1.transferencia(10, conta2);
        conta2.transferencia(1, conta3);

        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
        conta3.mostrarSaldo();
    }
}
