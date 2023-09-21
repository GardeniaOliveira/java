package Ex_01;

import java.util.Date;

public class Aviao {

    private int n_serie, n_motores;
    private String modelo;
    private Date ano_fabrico;

    private double peso, comprimento_fuselagem, envergadura_asas, altura_cauda, autonomia, velocidade, preco;

    public Aviao(int n_serie, int n_motores, String modelo, Date ano_fabrico, double peso, double comprimento_fuselagem, double envergadura_asas, double altura_cauda, double autonomia, double velocidade, double preco) {
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


}
