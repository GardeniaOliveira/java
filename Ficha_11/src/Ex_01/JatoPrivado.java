package Ex_01;


import Ex_01.Enum.CategoriaJato;

import java.util.ArrayList;

import Ex_01.Enum.Instalacoes;

public class JatoPrivado extends Aviao{
        private int lotacao;
        private double capacidade_bagagem;

        private CategoriaJato categoria;

        private ArrayList<Instalacoes> inst;

        public JatoPrivado(int n_serie, int n_motores, String modelo, int ano_fabrico, double peso, double comprimento_fuselagem, double envergadura_asas, double altura_cauda, double autonomia, double velocidade, double preco, int lotacao, double capacidade_bagagem, CategoriaJato categoria) {
                super(n_serie, n_motores, modelo, ano_fabrico, peso, comprimento_fuselagem, envergadura_asas, altura_cauda, autonomia, velocidade, preco);
                this.lotacao = lotacao;
                this.capacidade_bagagem = capacidade_bagagem;
                this.categoria = categoria;
                this.inst = new ArrayList<Instalacoes>() ;
        }

        public void AddInstalacao(Instalacoes instalacaoNova) {
                this.inst.add(instalacaoNova);
        }
        public void removeInstalacao(int index) {
                this.inst.remove(index);
        }

        public void exibirJatoPrivado(){
                super.exibirDados();
                System.out.println("Lotação: " + this.lotacao);
                System.out.println("Capacidade bagagem: " + this.capacidade_bagagem);
                System.out.println("Categoria: " + this.categoria);
                System.out.println("Instalações: " );
                for (Instalacoes inst: this.inst){
                        System.out.println(inst);
                }
        }
}
