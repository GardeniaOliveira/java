package Ex_01;

public class Aviao {

    private int n_serie, n_motores;
    private String modelo;
    private int ano_fabrico;

    private double peso, comprimento_fuselagem, envergadura_asas, altura_cauda, autonomia, velocidade, preco;

    public Aviao(int n_serie, int n_motores, String modelo, int ano_fabrico, double peso, double comprimento_fuselagem, double envergadura_asas, double altura_cauda, double autonomia, double velocidade, double preco) {
        this.n_serie = n_serie;
        this.n_motores = n_motores;
        this.modelo = modelo;
        this.ano_fabrico = ano_fabrico;
        this.peso = peso;
        this.comprimento_fuselagem = comprimento_fuselagem;
        this.envergadura_asas = envergadura_asas;
        this.altura_cauda = altura_cauda;
        this.autonomia = autonomia;
        this.velocidade = velocidade;
        this.preco = preco;
    }

    public void exibirDados(){
        System.out.println("Número de série: " + this.n_serie);
        System.out.println("Número de motores: " + this.n_motores);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano fabrico: " + this.ano_fabrico);
        System.out.println("Peso: " + this.peso);
        System.out.println("Comprimento fuselagem: " + this.comprimento_fuselagem);
        System.out.println("Envergadura asas : " + this.envergadura_asas );
        System.out.println("Altura cauda: " + this.altura_cauda);
        System.out.println("Autonomia : " + this.autonomia);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Preço: " + this.preco);
    }

}
