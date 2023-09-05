package Ex_05;

public class Carro {

    private String marca;

    private String modelo;

    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    void ligar(){
        System.out.println("O carro está ligado");
    }
}
