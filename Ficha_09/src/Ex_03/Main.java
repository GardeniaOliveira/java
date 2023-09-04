package Ex_03;

public class Main {
    public static double main(String[] args) {

        Retangulo retangulo1 = new Retangulo(1.6, 3);

        double result = retangulo1.getArea()*retangulo1.getPerimetro();
        System.out.println(result);
return result;

    }
}
