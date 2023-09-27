package Ex_01;

import Ex_01.Enum.Armas;
import Ex_01.Enum.CategoriaJato;
import Ex_01.Enum.Instalacoes;

public class main {
    public static void main(String[] args) {

        JatoPrivado boeing = new JatoPrivado(12345, 4, "boeing", 2013, 14.5, 7.8, 63, 1.6, 45,6, 13200, 45,38, CategoriaJato.HEAVY_JET);
        boeing.AddInstalacao(Instalacoes.COZINHA);
        boeing.AddInstalacao(Instalacoes.CHUVEIRO);
        boeing.AddInstalacao(Instalacoes.ESCRITORIO);

        AviaoCombate f23 = new AviaoCombate(1086, 2, "f23", 2004, 8, 89.3, 25, 45.3, 75.2, 800, 1000, "Brazil", false );
        f23.addArma(Armas.BOMBAS);


        boeing.exibirJatoPrivado();
        f23.exibirAviaoCombate();
    }
}
