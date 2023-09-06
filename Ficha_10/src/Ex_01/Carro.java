package Ex_01;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private int cilindrada;

    private TipoDeCombustivel combustivel;
    private int litros;
   private int idade;
    private int anoAtual = 2023;

    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, TipoDeCombustivel combustivel, int litros) {
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

    public void ligar(){

        if(this.idade > 30){
            if(combustivel.equals(TipoDeCombustivel.DIESEL)){
                System.out.println("“Deita um pouco de fumo… Custa a pegar… O carro está ligado!”\n" +
                        "“Vrum-vrum-vrum");
            }else{
                System.out.println("“Custa a pegar… O carro está ligado!”\n" +
                        "“Vrum-vrum-vrum”");
            }
        } else{
            if(potencia >= 250){
                System.out.println("“O carro está ligado!”\n" +
                        "“VRUUMMMMMM”");
            }else{
                System.out.println("“O carro está ligado!”\n" +
                        "“Vruummmmmmm”");
            }
        }
    }
}
