package Ex_09;

public class Produto {
    private String name;

    private double preco;

    private int qtd_estoque = 0;



    public Produto(String name, double preco, int qtd_estoque) {
        this.name = name;
        this.preco = preco;
        this.qtd_estoque = qtd_estoque;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }





    public void vender(int qtd_desejada){
if(this.qtd_estoque > qtd_desejada){
    System.out.println("Quantidade em estoque:" + this.qtd_estoque);
    this.qtd_estoque = qtd_estoque - qtd_desejada;
    System.out.println("Quantidade em estoque após a venda:" + this.qtd_estoque);
}else{
    System.out.println("Não temos quantidade em estoque suficiente para a venda");
}
    }

   public void comprar(int qtd_desejada){
       System.out.println("Quantidade em estoque:" + this.qtd_estoque);
this.qtd_estoque = this.qtd_estoque + qtd_desejada;
       System.out.println("Quantidade em estoque após a compra:" + this.qtd_estoque);
    }

}
