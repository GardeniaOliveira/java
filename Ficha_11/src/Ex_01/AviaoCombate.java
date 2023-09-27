package Ex_01;
import java.util.ArrayList;

import Ex_01.Enum.Armas;

public class AviaoCombate extends Aviao {
    private String pais_origem;

    private boolean camuflagem;
    private ArrayList<Armas> armas;

    public AviaoCombate(int n_serie, int n_motores, String modelo, int ano_fabrico, double peso, double comprimento_fuselagem, double envergadura_asas, double altura_cauda, double autonomia, double velocidade, double preco, String pais_origem, boolean camuflagem) {
        super(n_serie, n_motores, modelo, ano_fabrico, peso, comprimento_fuselagem, envergadura_asas, altura_cauda, autonomia, velocidade, preco);
        this.pais_origem = pais_origem;
        this.camuflagem = camuflagem;
        this.armas = new ArrayList<Armas>();
    }

    public void addArma(Armas armaNova) {
        if (this.armas.size() != 3) {
            this.armas.add(armaNova);
        } else {
            System.out.println("Não foi possivel adicionar " + armaNova + "o avião já está completo");
        }
    }

    public void removeArma(int index) {
        this.armas.remove(index);
    }

    public void exibirAviaoCombate(){
        super.exibirDados();
        System.out.println("País de origem: " + this.pais_origem);
        System.out.println("Camuflagem: " + this.camuflagem);
        System.out.println("Armas: " );
        for (Armas armaAtual: this.armas){
            System.out.println(armaAtual);
        }
    }
}

