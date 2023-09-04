package Ex_02;


public class  Cao{

    private String name;
    private String raca;
    private String latido= "au au au";

    public Cao(String name, String raca) {
        this.name = name;
        this.raca = raca;

    }

    public Cao(String name, String raca, String latido) {
        this.name = name;
        this.raca = raca;
        this.latido = latido;

    }


    public String getName() {
        return  this.name;
    }

    public String getRaca() {
        return this.raca;
    }

    public String getLatido() {
        return this.latido;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }
}