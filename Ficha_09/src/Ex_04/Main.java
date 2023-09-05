package Ex_04;

import Ex_03.Retangulo;

public class Main {

    public static void main(String[] args) {

      Circulo circulo1 = new Circulo(3.14, 3);

        double area = circulo1.getPI()*(circulo1.getRaio() *circulo1.getRaio());
        System.out.println("area: " + area);

        double circunferencia = 2*circulo1.getPI()*circulo1.getRaio();
        System.out.println("circunferencia: " + circunferencia);
    }
}
