package Ex_01;
import java.util.Scanner;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private int cilindrada;

    private TipoDeCombustivel combustivel;
    private double litros;
    private int idade;
    private int anoAtual = 2023;

    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, TipoDeCombustivel combustivel, double litros) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.litros = litros;
    }


    public int getIdade() {
        return this.idade = anoAtual - this.ano;
    }

    public void ligar() {

        if (this.getIdade() > 30) {
            if (combustivel.equals(TipoDeCombustivel.DIESEL)) {
                System.out.println("“Deita um pouco de fumo… Custa a pegar… O carro está ligado!”\n" +
                        "“Vrum-vrum-vrum");
            } else {
                System.out.println("“Custa a pegar… O carro está ligado!”\n" +
                        "“Vrum-vrum-vrum”");
            }
        } else {
            if (potencia >= 250) {
                System.out.println("“O carro está ligado!”\n" +
                        "“VRUUMMMMMM”");
            } else {
                System.out.println("“O carro está ligado!”\n" +
                        "“Vruummmmmmm”");
            }
        }
    }

    /*public static Carro introduzirCarro() {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduza a marca:");
        String marca = input.next();

        System.out.println("Introduza o modelo:");
        String modelo = input.next();

        System.out.println("Introduza o ano de fabrico:");
        int ano = input.nextInt();

        System.out.println("Introduza a potência:");
        int potencia = input.nextInt();

        System.out.println("Introduza a cilindrada:");
        int cilindrada = input.nextInt();

        System.out.println("Insira o tipo de combustivel no carro (GASOLINA, DIESEL, GLP): ");
        TipoDeCombustivel combustivel = TipoDeCombustivel.valueOf(input.next().toUpperCase());

        System.out.println("Insira o consumo:");
        double litros = input.nextDouble();


        Carro carroUtilizador = new Carro(marca, modelo, ano, potencia, cilindrada, combustivel, litros);
        return carroUtilizador;

    }*/

    public Carro corrida(Carro adversario) {
        if (this.potencia > adversario.potencia) {
            return this;
        } else {
            if (adversario.potencia > this.potencia) {
                return adversario;
            } else {
                //empate potencia

                if (this.cilindrada > adversario.cilindrada) {
                    return this;
                } else {
                    if (adversario.cilindrada > this.cilindrada) {
                        return adversario;
                    } else {
                        //empate cilindrada
                        if (adversario.idade < this.idade) {
                            return adversario;
                        }
                        if (adversario.idade > this.idade) {
                            return this;
                        } else {
                            return null;
                        }


                    }
                }
            }
        }

    }

    public void exibirCarro(){
        System.out.println(this.marca);
        System.out.println( this.modelo);
        System.out.println( this.ano);
        System.out.println( this.potencia);
        System.out.println( this.cilindrada);
        System.out.println( this.combustivel);
    }
}
