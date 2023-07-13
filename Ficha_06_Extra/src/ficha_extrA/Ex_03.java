package ficha_extrA;

import java.util.Scanner;

public class Ex_03 {

    static  double calcularAreaRetangulo(double base, double altura){
        double calculo;
        calculo= base*altura;
        return calculo;

    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        double base, altura, resultado;
        System.out.print("Introduza a base: ");
        base = input.nextDouble();
        System.out.print("Introduza a altura: ");
        altura = input.nextDouble();


        resultado= calcularAreaRetangulo(base, altura);

        System.out.print("A área do retangulo é: " +resultado);
    }
}
