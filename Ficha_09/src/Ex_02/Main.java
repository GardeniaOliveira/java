package Ex_02;

import Ex_01.Pessoa;

public class Main {
    public static void main(String[] args) {
       Cao cao1 = new Cao("pluto", "vira-lata");
        System.out.println(cao1.getLatido());

       cao1.setLatido("woof");

        System.out.println(cao1.getLatido());

        System.out.println(cao1.getName());
        System.out.println(cao1.getRaca());


    }
}
