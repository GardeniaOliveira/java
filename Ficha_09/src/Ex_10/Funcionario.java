package Ex_10;

public class Funcionario {

    private String name;
    private double salario;
    private String departamento;

    public Funcionario(String name, double salario, String departamento) {
        this.name = name;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void aumentarSalario(int valor){
        System.out.println("Salário atual:" + this.salario);
        this.salario = (salario * valor)/100 + this.salario;

        System.out.println("Salário após o aumento de "+ valor + "% :" + this.salario);
    }

    public void exibirDados(){
        System.out.println( this.name + ", " + this.salario + ", " +this.departamento);
    }
}
