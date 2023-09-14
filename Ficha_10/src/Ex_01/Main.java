package Ex_01;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Carro carro1 = new Carro("fiat", "palio", 1950, 150, 250, TipoDeCombustivel.GASOLINA, 25);

        Carro carro2 = new Carro("renault", "palio", 2023, 350, 230, TipoDeCombustivel.GASOLINA, 5);

        carro2.corrida(carro1).exibirCarro();

    }
}
