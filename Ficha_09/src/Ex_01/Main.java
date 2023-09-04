package Ex_01;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Gardênia", 21, 1.63);
        Pessoa pessoa2 = new Pessoa("Vivi", 19, 1.7);

        System.out.println("*** Detalhes pessoa 1 ***" );
        System.out.println(pessoa1.getName());
        System.out.println(pessoa1.getAge());
        System.out.println(pessoa1.getHeight());

        System.out.println("*** Detalhes pessoa 2 ***" );
        System.out.println(pessoa2.getName());
        System.out.println(pessoa2.getAge());
        System.out.println(pessoa2.getHeight());
    }
}