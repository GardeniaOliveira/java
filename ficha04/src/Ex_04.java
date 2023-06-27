import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, divisor;
        boolean naoPrimo=false;

        System.out.println("Digite um número ");
        num = input.nextInt();


        for (divisor=num-1;divisor>1; divisor--){

            System.out.print("A executar: "+num+"/"+divisor+"...\t");
            System.out.println("Resto: "+num%divisor);

            if(num%divisor==0){
                naoPrimo=true;
                System.out.println("Atencao, agora percebemos que o numero nao e primo");
            }

        }

        if(naoPrimo==true){
            System.out.println(num + " não é primo");
        } else{
            System.out.println(num + " é primo");
        }

    }
}
