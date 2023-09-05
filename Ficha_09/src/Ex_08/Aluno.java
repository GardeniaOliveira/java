package Ex_08;

public class Aluno {

    private String name;
    private int idade;
    private String curso;

    private double media;

    public Aluno(String name, int idade, String curso, double media) {
        this.name = name;
        this.idade = idade;
        this.curso = curso;
        this.media = media;
    }

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() {
        return curso;
    }

    public double getMedia() {
        return media;
    }

    public void Aprovado(){
        if(this.media > 9.5){
        System.out.println(this.name + ", você foi aprovado");
        }else{
        System.out.println(this.name + ", infelizmente, você reprovou!");
        }
    }
}
